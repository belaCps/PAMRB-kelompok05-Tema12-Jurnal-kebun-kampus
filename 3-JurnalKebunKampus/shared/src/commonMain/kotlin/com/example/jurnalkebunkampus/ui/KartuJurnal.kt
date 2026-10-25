package com.example.jurnalkebunkampus.ui

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import com.example.jurnalkebunkampus.model.JurnalPerawatan

@Composable
fun KartuJurnal(
    jurnal: JurnalPerawatan,
    namaTanaman: String,
    ringkas: Boolean = false,
    onKlik: () -> Unit = {}
) {
    Card(
        modifier = Modifier.fillMaxWidth().clickable { onKlik() },
        elevation = CardDefaults.cardElevation(2.dp)
    ) {
        Row(
            modifier = Modifier.fillMaxWidth().padding(16.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Column(Modifier.weight(1f)) {
                Text(
                    text = jurnal.kegiatan,
                    fontWeight = FontWeight.Bold,
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis
                )
                if (!ringkas) {
                    Text("$namaTanaman - ${jurnal.tanggal}", color = Color.Gray)
                }
            }
            Spacer(Modifier.width(8.dp))
            LabelStatus(jurnal.status)
        }
    }
}

