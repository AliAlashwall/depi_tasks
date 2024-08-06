package com.example.detailsscreen.navigation

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.detailsscreen.data.issueDataList
import com.example.detailsscreen.presentation.screens.detailsScreen.DetailsScreen
import com.example.detailsscreen.presentation.screens.issues.IssuesScreen

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun NavGraph(startDestination: String) {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = startDestination) {
        composable(Screens.Details.route) {
            DetailsScreen(
                onShowIssueClicked = { navController.navigate(Screens.IssueDetail.route) },
                onBackClicked = {}
            )
        }

        composable(Screens.IssueDetail.route) {
            IssuesScreen(
                issueList = issueDataList, onBackClicked = { navController.popBackStack() },
                onIssueItemClicked = {}
            )
        }

    }

}