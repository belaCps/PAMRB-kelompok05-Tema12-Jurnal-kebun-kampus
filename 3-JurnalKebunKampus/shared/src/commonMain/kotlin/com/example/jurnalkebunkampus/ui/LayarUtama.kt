package com.example.jurnalkebunkampus.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jurnalkebunkampus.model.JurnalPerawatan
import com.example.jurnalkebunkampus.model.Tanaman

@Composable
fun LayarUtama(
    semua: List<JurnalPerawatan>,
    tanaman: List<Tanaman>
) {
    val terbaru = semua.sortedByDescending { it.id }

    Scaffold(
        floatingActionButton = {
            FloatingActionButton(onClick = { /* belum berfungsi, dikerjakan di Modul 5 */ }) {
                Text("+", fontSize = 24.sp)
            }
        }
    ) { padding ->
        Column(Modifier.padding(padding)) {
            Column(Modifier.padding(start = 16.dp, end = 16.dp, top = 16.dp)) {
                Text(
                    text = "Jurnal Kebun Kampus",
                    fontSize = 28.sp,
                    fontWeight = FontWeight.Bold,
                    color = MaterialTheme.colorScheme.primary
                )
                Text("${semua.size} jurnal perawatan tercatat", color = Color.Gray)
            }
            DaftarJurnal(
                semua = terbaru,
                tanaman = tanaman,
                modifier = Modifier.weight(1f)
            )
        }
    }
}

