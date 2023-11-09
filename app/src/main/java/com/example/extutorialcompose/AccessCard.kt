package com.example.extutorialcompose

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun AccessCard() {
    Column(
        Modifier
            .fillMaxSize()
            .background(Color(0xFFFA8072)),
        verticalArrangement = Arrangement.SpaceEvenly,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        PersonCard(
            name = "Jéssica Aline Pereira dos Santos",
            occupation = "Assistente de Marketing"
        )
        PersonInfo(
            "+55 31 98121-4235",
            "@Jesalinep",
            "jessicaaline.bh@gmail.com"
        )
    }
}


@Composable
fun PersonCard(name: String, occupation: String) {
    val marketingIcon = painterResource(id = R.drawable.marketing_icon)
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = marketingIcon,
            contentDescription = "Marketing Icon"
        )
        Text(
            text = name,
            textAlign = TextAlign.Center,
            fontSize = 20.sp,
            fontFamily = FontFamily.Monospace

            )
        Text(
            text = occupation,
            Modifier.padding(top = 5.dp)
        )
    }
}


@Composable
fun PersonInfo(number: String, instagram: String, email: String) {
    Row {
        Column (
            verticalArrangement = Arrangement.spacedBy(3.dp)
        ){
            Icon(
                imageVector = Icons.Default.Call,
                contentDescription = "Phone Number"
            )
            Icon(
                imageVector = Icons.Default.Share,
                contentDescription = "Instagram"
            )
            Icon(
                imageVector = Icons.Default.Email,
                contentDescription = "Email"
            )
        }
        Column(
            Modifier.padding(start = 5.dp),
            verticalArrangement = Arrangement.spacedBy(5.dp),
        ) {
            Text(
                text = number
            )
            Text(
                text = instagram
            )
            Text(
                text = email
            )
        }
    }
}


@Preview(showBackground = true)
@Composable
fun AccessCardPreview() {
    AccessCard()
}

