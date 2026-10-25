package com.example.jurnalkebunkampus

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import com.example.jurnalkebunkampus.ui.LayarUtama

@Composable
fun App() {
    MaterialTheme {
        LayarUtama(semua = contohJurnal, tanaman = contohTanaman)
    }
}