package com.example.detailsscreen

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import com.example.detailsscreen.presentation.screens.detailsScreen.DetailsScreen
import com.example.detailsscreen.presentation.theme.DetailsScreenTheme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DetailsScreenTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { paddingValues ->
                    DetailsScreen(modifier = Modifier.padding(paddingValues))
                }
            }
        }
    }
}
