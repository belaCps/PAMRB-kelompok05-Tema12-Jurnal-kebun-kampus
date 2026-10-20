
package com.example.jurnalkebunkampus

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeDrawingPadding
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.jurnalkebunkampus.model.JurnalPerawatan
import com.example.jurnalkebunkampus.model.label
import com.example.jurnalkebunkampus.model.ringkas
import kotlinx.coroutines.flow.collect

@Composable
fun App() = MaterialTheme {
    var jurnal by remember {
        mutableStateOf<JurnalPerawatan?>(null)
    }

    LaunchedEffect(Unit) {
        SumberJurnalPerawatan().pantau(1).collect { data ->
            jurnal = data
        }
    }

    Surface(modifier = Modifier.fillMaxSize()) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .safeDrawingPadding()
                .padding(24.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Top
        ) {
            Text(
                text = "Jurnal Kebun Kampus",
                style = MaterialTheme.typography.headlineMedium,
                color = MaterialTheme.colorScheme.primary
            )

            Spacer(Modifier.height(8.dp))

            Text("Catatan perawatan tanaman kampus")

            Spacer(Modifier.height(24.dp))

            Text(
                text = "Jurnal Perawatan",
                style = MaterialTheme.typography.titleLarge
            )

            Spacer(Modifier.height(12.dp))

            Card {
                Column(
                    modifier = Modifier.padding(16.dp)
                ) {
                    if (jurnal == null) {
                        Text("Memuat data jurnal...")
                    } else {
                        Text(
                            text = jurnal!!.ringkas(),
                            style = MaterialTheme.typography.titleMedium
                        )

                        Spacer(Modifier.height(8.dp))

                        Text("Tanaman ID: ${jurnal!!.tanamanId}")
                        Text("Catatan: ${jurnal!!.catatan ?: "-"}")

                        Spacer(Modifier.height(12.dp))

                        Text(
                            text = "Status: ${jurnal!!.status.label()}",
                            color = MaterialTheme.colorScheme.primary,
                            style = MaterialTheme.typography.bodyLarge
                        )
                    }
                }
            }
        }
    }
}
