package com.example.jurnalkebunkampus.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.jurnalkebunkampus.model.JurnalPerawatan
import com.example.jurnalkebunkampus.model.Tanaman

@Composable
fun DaftarJurnal(
    semua: List<JurnalPerawatan>,
    tanaman: List<Tanaman>,
    modifier: Modifier = Modifier,
    onPilih: (JurnalPerawatan) -> Unit = {}
) {
    LazyColumn(
        modifier = modifier,
        contentPadding = PaddingValues(16.dp),
        verticalArrangement = Arrangement.spacedBy(12.dp)
    ) {
        items(semua, key = { it.id }) { jurnal ->
            val nama = tanaman.firstOrNull { it.id == jurnal.tanamanId }?.nama ?: "Tanaman tidak dikenal"
            KartuJurnal(
                jurnal = jurnal,
                namaTanaman = nama,
                onKlik = { onPilih(jurnal) }
            )
        }
    }
}

