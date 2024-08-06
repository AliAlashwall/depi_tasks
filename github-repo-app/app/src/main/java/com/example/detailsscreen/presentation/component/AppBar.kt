package com.example.detailsscreen.presentation.component

import androidx.compose.foundation.background
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import com.example.detailsscreen.presentation.theme.DetailsScreenTheme


@ExperimentalMaterial3Api
@Composable
fun AppBar(
    modifier: Modifier = Modifier,
    title: String,
    titleStyle: TextStyle = MaterialTheme.typography.titleLarge,
    backgroundColor: Color = MaterialTheme.colorScheme.primary,
    showBackArrow: Boolean = true,
    onBackArrowClicked: () -> Unit = {},
) {
    CenterAlignedTopAppBar(
        modifier = modifier.background(backgroundColor),
        title = {
            Text(
                text = title,
                style = titleStyle
            )
        },
        navigationIcon = {
            if (showBackArrow)
                IconButton(onClick = onBackArrowClicked) {
                    Icon(
                        imageVector = Icons.AutoMirrored.Filled.ArrowBack,
                        contentDescription = "Arrow for back navigation"
                    )
                }
        },
    )
}

@ExperimentalMaterial3Api
@Preview
@Composable
private fun PreviewAppBar() {
    DetailsScreenTheme {
        AppBar(title = "Github Repos") {
        }
    }
}