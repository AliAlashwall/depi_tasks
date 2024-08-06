package com.example.detailsscreen

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import com.example.detailsscreen.data.issueDataList
import com.example.detailsscreen.presentation.screens.issues.IssuesScreen
import com.example.detailsscreen.presentation.theme.GithubRepoTheme

class MainActivity : ComponentActivity() {

    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            GithubRepoTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { paddingValues ->
//                    DetailsScreen(modifier = Modifier.padding(paddingValues))
                    IssuesScreen(
                        issueList = issueDataList, onBackClicked = {},
                        modifier = Modifier.padding(paddingValues))
                }
            }
        }
    }
}
