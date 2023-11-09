package com.example.extutorialcompose

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun TaskComplete() {
 Column (
     verticalArrangement = Arrangement.Center,
     horizontalAlignment = Alignment.CenterHorizontally
 ) {
    TaskImage()
    TextTask(message1 = "All tasks completed", message2 = "Nice work!")
 }
}

@Composable
fun TaskImage() {
    val image = painterResource(id = R.drawable.ic_task_completed)
    Image(
        painter = image,
        contentDescription = "Task Complete"
    )
}

@Composable
fun TextTask(message1: String, message2: String){
    Text(
        text = message1,
        fontWeight = FontWeight.Bold,
        modifier = Modifier.padding(top = 24.dp, bottom = 8.dp)
    )

    Text(
        text = message2,
        fontSize = 16.sp
    )
}