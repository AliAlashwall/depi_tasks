package com.example.detailsscreen.presentation.screens.issues

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.detailsscreen.R
import com.example.detailsscreen.data.IssuesData
import com.example.detailsscreen.presentation.theme.GithubRepoTheme

@Composable
fun IssueItem(issuesData: IssuesData) {
    Card(
        modifier = Modifier.fillMaxWidth(),
        shape = MaterialTheme.shapes.medium,
        colors = CardDefaults.cardColors(Color.White)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            verticalAlignment = Alignment.Top
        ) {
            Image(
                painter = painterResource(id = issuesData.image),
                contentDescription = stringResource(R.string.issue_screen_issue_image),
                modifier = Modifier
                    .size(30.dp)
                    .shadow(shape = RoundedCornerShape(50.dp), elevation = 0.dp)
                    .weight(0.5f),
                contentScale = ContentScale.Fit,
                alignment = Alignment.CenterStart
            )

            Column(
                modifier = Modifier.weight(3f),
                verticalArrangement = Arrangement.spacedBy(12.dp)
            ) {
                Text(
                    text = issuesData.title, style = MaterialTheme.typography.bodyLarge,
                    modifier = Modifier,
                    color = Color.Black,
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis
                )

                Text(
                    text = issuesData.content,
                    style = MaterialTheme.typography.bodyMedium,
                )

                Text(
                    text = buildAnnotatedString {
                        append(stringResource(R.string.issues_screen_created) + " ")
                        withStyle(
                            style = SpanStyle(
                                fontWeight = FontWeight.Normal,
                            )
                        ) {
                            append(issuesData.dateCreated)
                        }
                    },
                    style = MaterialTheme.typography.labelLarge,
                    color = Color.Black
                )

            }
            Text(
                text = stringResource(R.string.issues_screen_status),
                style = MaterialTheme.typography.bodyMedium,
                modifier = Modifier.weight(0.8f),
                textAlign = TextAlign.End
            )
        }
    }
}


@Preview
@Composable
private fun IssueItemPreview() {
    GithubRepoTheme {
        IssueItem(
            issuesData = IssuesData(
                image = R.drawable.google_icon,
                title = "Bump pyarrow from 5.0.0 to 5.0.0",
                content = "NONE",
                dateCreated = "2023-08-06, 12:00 PM",
            )
        )
    }
}