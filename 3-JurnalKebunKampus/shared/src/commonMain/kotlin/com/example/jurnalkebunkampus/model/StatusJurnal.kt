package com.example.jurnalkebunkampus.model

sealed class StatusJurnal {
    data object Diajukan : StatusJurnal()
    data object Disetujui : StatusJurnal()
    data object Ditolak : StatusJurnal()
}
