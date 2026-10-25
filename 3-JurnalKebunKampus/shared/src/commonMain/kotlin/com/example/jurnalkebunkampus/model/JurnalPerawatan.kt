package com.example.jurnalkebunkampus.model

data class JurnalPerawatan(
    val id: Int,
    val tanamanId: Int,
    val tanggal: String,
    val kegiatan: String,
    val catatan: String?,
    val status: StatusJurnal = StatusJurnal.Diajukan
)
