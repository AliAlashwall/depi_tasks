package com.example.recyclerview


data class SendersData(
    val userName: String,
    val userMessage: String
)

val senderDataList: List<SendersData> = listOf(
    SendersData(userName = "Alice", userMessage = "Hello, how are you?"),
    SendersData(userName = "Bob", userMessage = "I'm fine, thank you!"),
    SendersData(userName = "Charlie", userMessage = "What's up?"),
    SendersData(userName = "David", userMessage = "Good morning!"),
    SendersData(userName = "Eva", userMessage = "Let's meet up."),
    SendersData(userName = "Frank", userMessage = "See you soon."),
    SendersData(userName = "Grace", userMessage = "How's it going?"),
    SendersData(userName = "Hank", userMessage = "Nice to meet you."),
    SendersData(userName = "Ivy", userMessage = "Have a great day!"),
    SendersData( userName = "Jack", userMessage = "What are you up to?"),
    SendersData( userName = "Karen", userMessage = "Long time no see."),
    SendersData( userName = "Leo", userMessage = "Catch you later."),
    SendersData( userName = "Mona", userMessage = "Happy birthday!"),
    SendersData( userName = "Nina", userMessage = "Congratulations!"),
    SendersData( userName = "Oscar", userMessage = "Best wishes."),
    SendersData( userName = "Pia", userMessage = "Good luck!"),
    SendersData( userName = "Quinn", userMessage = "Nice job!"),
    SendersData( userName = "Rose", userMessage = "Well done!"),
    SendersData( userName = "Sam", userMessage = "Take care."),
    SendersData( userName = "Tina", userMessage = "Goodbye.")
)