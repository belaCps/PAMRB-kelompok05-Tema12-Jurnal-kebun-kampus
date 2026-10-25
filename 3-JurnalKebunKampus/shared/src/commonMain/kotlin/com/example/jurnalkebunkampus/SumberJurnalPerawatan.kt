
package com.example.jurnalkebunkampus

import com.example.jurnalkebunkampus.model.JurnalPerawatan
import com.example.jurnalkebunkampus.model.StatusJurnal
import com.example.jurnalkebunkampus.model.ringkas
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

interface Sumber<T> {
    suspend fun ambil(id: Int): T
    fun pantau(id: Int): Flow<T>
}

class SumberJurnalPerawatan : Sumber<JurnalPerawatan> {

    private fun contohJurnal(id: Int) = JurnalPerawatan(
        id = id,
        tanamanId = 1,
        tanggal = "20-10-2026",
        kegiatan = "Menyiram tanaman",
        catatan = "Tanaman dalam kondisi baik",
        status = StatusJurnal.Diajukan
    )

    override suspend fun ambil(id: Int): JurnalPerawatan {
        delay(1000)
        require(id > 0) { "ID harus positif" }
        return contohJurnal(id)
    }

    override fun pantau(id: Int): Flow<JurnalPerawatan> = flow {
        require(id > 0) { "ID harus positif" }

        emit(contohJurnal(id))
        delay(1000)

        emit(
            contohJurnal(id).copy(
                status = StatusJurnal.Disetujui
            )
        )

        delay(1000)

        emit(
            contohJurnal(id).copy(
                status = StatusJurnal.Ditolak
            )
        )
    }
}


