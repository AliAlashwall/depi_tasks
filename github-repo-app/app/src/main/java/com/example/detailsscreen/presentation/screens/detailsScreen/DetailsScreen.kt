package com.example.detailsscreen.presentation.screens.detailsScreen

import android.annotation.SuppressLint
import androidx.annotation.IdRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.detailsscreen.R
import com.example.detailsscreen.presentation.theme.DetailsScreenTheme
import com.example.detailsscreen.presentation.theme.background
import com.example.detailsscreen.presentation.theme.buttonColor

@SuppressLint("ResourceType")
@Composable
fun DetailsScreen(modifier: Modifier = Modifier) {
    Scaffold(
        topBar = { DetailsTopBar() },
    ) { paddingValues ->
        Column(
            modifier = modifier
                .fillMaxSize()
                .padding(paddingValues)
                .background(background)
                .padding(20.dp),
            verticalArrangement = Arrangement.spacedBy(20.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = painterResource(id = R.drawable.google_icon),
                contentDescription = null,
                modifier = Modifier.size(180.dp)
            )

            Text(
                text = stringResource(R.string.details_screen_language),
                style = MaterialTheme.typography.titleLarge
            )

            Row(
                Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceAround
            ) {
                TextWithIcon(
                    text = stringResource(R.string.details_screen_rate),
                    iconId = R.drawable.star
                )
                TextWithIcon(
                    text = stringResource(R.string.details_screen_programming_language),
                    iconId = R.drawable.blue_circle
                )
                TextWithIcon(
                    text = stringResource(R.string.details_screen_github_score),
                    iconId = R.drawable.new_branch
                )
            }

            Text(
                text = stringResource(R.string.details_screen_description),
                style = MaterialTheme.typography.bodyMedium
            )

            Spacer(modifier = Modifier.weight(1f))

            Button(
                onClick = {},
                modifier = Modifier.fillMaxWidth(),
                shape = MaterialTheme.shapes.medium,
                colors = ButtonDefaults.buttonColors(buttonColor)
            ) {
                Text(
                    text = stringResource(R.string.details_screen_show_issues),
                    style = MaterialTheme.typography.titleLarge,
                    color = Color.White,
                    modifier = Modifier.padding(8.dp)
                )
            }
        }
    }
}

@SuppressLint("ResourceType")
@Composable
fun TextWithIcon(
    text: String,
    @IdRes iconId: Int
) {

    Row(
        verticalAlignment = Alignment.CenterVertically,
    ) {
        Text(
            text = text,
            textAlign = TextAlign.Center,
            style = MaterialTheme.typography.bodyMedium
        )
        Spacer(modifier = Modifier.width(8.dp))
        Image(
            painter = painterResource(id = iconId),
            contentDescription = null,
            Modifier.size(24.dp)
        )
    }
}

@Composable
fun DetailsTopBar() {

    Row(
        Modifier
            .height(70.dp)
            .fillMaxWidth()
            .padding(16.dp), verticalAlignment = Alignment.CenterVertically
    ) {

        Image(
            painter = painterResource(id = R.drawable.back_arrrow),
            contentDescription = null,
            Modifier.size(24.dp)
        )
        Text(
            text = stringResource(R.string.details_screen_name),
            modifier = Modifier.fillMaxWidth(),
            textAlign = TextAlign.Center,
            style = MaterialTheme.typography.titleLarge
        )
    }
}

@Preview(showSystemUi = true)
@Composable
private fun DetailsScreesPreview() {
    DetailsScreenTheme { DetailsScreen() }
}