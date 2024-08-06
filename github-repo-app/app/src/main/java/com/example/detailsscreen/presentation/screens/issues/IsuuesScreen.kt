package com.example.detailsscreen.presentation.screens.issues

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.detailsscreen.R
import com.example.detailsscreen.data.IssuesData
import com.example.detailsscreen.data.issueDataList
import com.example.detailsscreen.presentation.component.AppBar
import com.example.detailsscreen.presentation.theme.GithubRepoTheme
import com.example.detailsscreen.presentation.theme.background

@ExperimentalMaterial3Api
@Composable
fun IssuesScreen(
    issueList: List<IssuesData>,
    onBackClicked: () -> Unit
) {
    Scaffold(
        topBar = {
            AppBar(
                title = stringResource(R.string.issue_screen_top_bar),
                showBackArrow = true,
                onBackArrowClicked = onBackClicked
            )
        },
        containerColor = MaterialTheme.colorScheme.background
    ) { paddingValues ->
        LazyColumn(
            contentPadding = paddingValues,
            modifier = Modifier.background(background).padding(8.dp),
            verticalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            items(issueList.size) { index ->
                IssueItem(issuesData = issueList[index])
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Preview
@Composable
private fun IssueScreenPreview() {
    GithubRepoTheme {
        IssuesScreen(issueList = issueDataList) {

        }
    }
}