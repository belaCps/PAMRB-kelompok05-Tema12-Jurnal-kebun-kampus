package com.example.jurnalkebunkampus

expect fun namaPlatform(): String

fun sapaan(): String = "Jurnal Kebun Kampus berjalan di ${namaPlatform()}"