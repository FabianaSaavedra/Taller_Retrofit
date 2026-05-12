package com.example.retrofit_taller.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

private val AppColorScheme = lightColorScheme(
    primary              = Color(0xFFE65100),
    onPrimary            = Color.White,
    primaryContainer     = Color(0xFFFFCCBC),
    onPrimaryContainer   = Color(0xFF3E0000),
    secondary            = Color(0xFF795548),
    secondaryContainer   = Color(0xFFD7CCC8),
    onSecondaryContainer = Color(0xFF3E2723),
    background           = Color(0xFFFFFBF8),
    surface              = Color(0xFFFFFBF8),
)

@Composable
fun MealAppTheme(content: @Composable () -> Unit) {
    MaterialTheme(
        colorScheme = AppColorScheme,
        content = content
    )
}
