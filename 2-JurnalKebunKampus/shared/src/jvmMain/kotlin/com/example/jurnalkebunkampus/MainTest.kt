
package com.example.jurnalkebunkampus

import com.example.jurnalkebunkampus.model.label
import com.example.jurnalkebunkampus.model.ringkas
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.runBlocking

fun main() = runBlocking {
    val sumber = SumberJurnalPerawatan()

    println("=== Pengujian Jurnal Perawatan ===")

    val jurnal = sumber.ambil(1)
    println("Data awal: ${jurnal.ringkas()}")

    println("\nPerubahan status jurnal:")

    sumber.pantau(1).collect { data ->
        println("Jurnal #${data.id}: ${data.status.label()}")
    }
}
