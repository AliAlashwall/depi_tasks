package com.example.detailsscreen.navigation

sealed class Screens(val route: String) {
    data object Details : Screens("detailsScreen")
    data object IssueDetail : Screens("issueScreen")
}