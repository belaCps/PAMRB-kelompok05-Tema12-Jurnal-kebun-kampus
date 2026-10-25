
package com.example.jurnalkebunkampus.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jurnalkebunkampus.model.StatusJurnal
import com.example.jurnalkebunkampus.model.label

@Composable
fun LabelStatus(status: StatusJurnal) {
    val warna = when (status) {
        StatusJurnal.Diajukan -> Color(0xFFF6EDCF)
        StatusJurnal.Disetujui -> Color(0xFFDCEFD6)
        StatusJurnal.Ditolak -> Color(0xFFF8D7D3)
    }
    Text(
        text = status.label(),
        fontSize = 12.sp,
        color = Color.Black,
        modifier = Modifier
            .background(warna, RoundedCornerShape(50))
            .padding(horizontal = 12.dp, vertical = 4.dp)
    )
}
