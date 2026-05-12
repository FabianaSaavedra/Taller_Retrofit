package com.example.retrofit_taller

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.retrofit_taller.ui.screens.MealScreen
import com.example.retrofit_taller.ui.theme.MealAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MealAppTheme {
                MealScreen()
            }
        }
    }
}