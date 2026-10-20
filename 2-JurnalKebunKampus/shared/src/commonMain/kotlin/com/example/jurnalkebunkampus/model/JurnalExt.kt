package com.example.jurnalkebunkampus.model

fun StatusJurnal.label(): String = when (this) {
    StatusJurnal.Diajukan -> "Menunggu pemeriksaan"
    StatusJurnal.Disetujui -> "Disetujui"
    StatusJurnal.Ditolak -> "Ditolak"
}

fun JurnalPerawatan.ringkas(): String =
    "#$id - $kegiatan ($tanggal)"
