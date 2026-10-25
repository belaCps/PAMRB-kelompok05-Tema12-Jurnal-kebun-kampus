package com.example.jurnalkebunkampus

import com.example.jurnalkebunkampus.model.JurnalPerawatan
import com.example.jurnalkebunkampus.model.StatusJurnal
import com.example.jurnalkebunkampus.model.Tanaman

val contohTanaman = listOf(
    Tanaman(1, "Pohon Mangga", "Pohon buah", "Taman Rektorat"),
    Tanaman(2, "Bunga Kamboja", "Tanaman hias", "Depan GKU 1"),
    Tanaman(3, "Cabai Rawit", "Sayuran", "Kebun Hidroponik"),
    Tanaman(4, "Lidah Mertua", "Tanaman hias", "Lobi Perpustakaan")
)

// Urutan parameter: id, tanamanId, tanggal, kegiatan, catatan, status
val contohJurnal = listOf(
    JurnalPerawatan(1, 1, "12-10-2026", "Menyiram tanaman", "Tanah masih lembap", StatusJurnal.Disetujui),
    JurnalPerawatan(2, 2, "12-10-2026", "Memangkas ranting kering", null, StatusJurnal.Disetujui),
    JurnalPerawatan(3, 3, "13-10-2026", "Memberi pupuk kompos", "Dua genggam per polybag", StatusJurnal.Disetujui),
    JurnalPerawatan(4, 4, "14-10-2026", "Membersihkan debu pada daun", null, StatusJurnal.Disetujui),
    JurnalPerawatan(5, 1, "15-10-2026", "Menyemprot pestisida nabati", "Ada ulat kecil di daun", StatusJurnal.Ditolak),
    JurnalPerawatan(6, 3, "16-10-2026", "Mengganti media tanam", "Campuran tanah dan sekam", StatusJurnal.Disetujui),
    JurnalPerawatan(7, 2, "17-10-2026", "Menyiangi gulma di sekitar batang", null, StatusJurnal.Diajukan),
    JurnalPerawatan(8, 3, "18-10-2026", "Menyiram tanaman", "Cuaca panas, disiram dua kali", StatusJurnal.Diajukan),
    JurnalPerawatan(9, 4, "20-10-2026", "Memindahkan ke pot lebih besar", "Akar sudah memenuhi pot", StatusJurnal.Diajukan),
    JurnalPerawatan(10, 1, "21-10-2026", "Menggemburkan tanah", null, StatusJurnal.Diajukan),
    JurnalPerawatan(11, 3, "23-10-2026", "Memanen cabai rawit", "Hasil sekitar satu ons", StatusJurnal.Disetujui),
    JurnalPerawatan(12, 2, "24-10-2026", "Menyiram tanaman", "Tanah mulai kering", StatusJurnal.Diajukan)
)