package com.example.pickof.ui.theme


import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.pickof.R



val gamaamli = FontFamily(
    Font(R.font.gamaamli, FontWeight.Normal)
)

val Typography = Typography(
    bodySmall = TextStyle(
        fontFamily = gamaamli,
        fontWeight = FontWeight.Normal,
        fontSize = 30.sp,
        lineHeight = 24.sp,
        letterSpacing = 0.5.sp
    )
)

