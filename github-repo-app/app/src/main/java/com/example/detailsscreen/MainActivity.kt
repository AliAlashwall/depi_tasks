package com.example.detailsscreen

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import com.example.detailsscreen.navigation.NavGraph
import com.example.detailsscreen.navigation.Screens
import com.example.detailsscreen.presentation.theme.GithubRepoTheme

class MainActivity : ComponentActivity() {

    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            GithubRepoTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { paddingValues ->
//                    DetailsScreen(modifier = Modifier.padding(paddingValues))
                    NavGraph(startDestination = Screens.Details.route)
                }
            }
        }
    }
}
