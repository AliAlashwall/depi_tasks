package com.example.detailsscreen.data

import androidx.annotation.DrawableRes
import com.example.detailsscreen.R

data class IssuesData(
    @DrawableRes val image: Int,
    val title: String,
    val content: String,
    val dateCreated: String,
)


val issueDataList = listOf(
    IssuesData(
        image = R.drawable.issue,
        title = "Issue with Login on Mobile Devices",
        content = "NONE",
        dateCreated = "2023-08-06,10:00 AM"
    ),
    IssuesData(
        image = R.drawable.issue,
        title = "Payment Gateway Fails to Process Transactions",
        content = "NONE",
        dateCreated = "2023-08-06,11:00 AM"
    ),
    IssuesData(
        image = R.drawable.issue,
        title = "Application Crashes When Accessing Booking Page",
        content = "NONE",
        dateCreated = "2023-08-06,12:00 PM"
    ),
    IssuesData(
        image = R.drawable.issue,
        title = "Slow Performance on Home Screen Loading",
        content = "NONE",
        dateCreated = "2023-08-06,01:00 PM"
    ),
    IssuesData(
        image = R.drawable.issue,
        title = "Push Notifications Not Being Received Properly",
        content = "NONE",
        dateCreated = "2023-08-06,02:00 PM"
    ),
    IssuesData(
        image = R.drawable.issue,
        title = "Graphical Glitch on User Profile Screen",
        content = "NONE",
        dateCreated = "2023-08-06,03:00 PM"
    ),
    IssuesData(
        image = R.drawable.issue,
        title = "Network Connectivity Issues During Logout Process",
        content = "NONE",
        dateCreated = "2023-08-06,04:00 PM"
    ),
    IssuesData(
        image = R.drawable.issue,
        title = "Data Synchronization Problems With Server",
        content = "NONE",
        dateCreated = "2023-08-06,05:00 PM"
    ),
    IssuesData(
        image = R.drawable.issue,
        title = "Incorrect Pricing Displayed for Playground Booking",
        content = "NONE",
        dateCreated = "2023-08-06,06:00 PM"
    ),
    IssuesData(
        image = R.drawable.issue,
        title = "Language Settings Not Applying Across App",
        content = "NONE",
        dateCreated = "2023-08-06,07:00 PM"
    ),
    IssuesData(
        image = R.drawable.issue,
        title = "GPS Location Detection Error During Usage",
        content = "NONE",
        dateCreated = "2023-08-06,08:00 PM"
    ),
    IssuesData(
        image = R.drawable.issue,
        title = "Feedback Submission Form Not Working Correctly",
        content = "NONE",
        dateCreated = "2023-08-06,09:00 PM"
    ),
    IssuesData(
        image = R.drawable.issue,
        title = "Security Alert Triggered on Profile Access",
        content = "NONE",
        dateCreated = "2023-08-06,10:00 PM"
    ),
    IssuesData(
        image = R.drawable.issue,
        title = "Missing Features After Recent Application Update",
        content = "NONE",
        dateCreated = "2023-08-06,11:00 PM"
    ),
    IssuesData(
        image = R.drawable.issue,
        title = "Notification Sound Not Playing on Alerts",
        content = "NONE",
        dateCreated = "2023-08-06,08:00 AM"
    )
)
