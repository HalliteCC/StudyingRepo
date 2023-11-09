package com.example.extutorialcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.extutorialcompose.ui.theme.ExTutorialComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ExTutorialComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    AccessCard()
                }
            }
        }
    }
}

@Composable
fun Tutorial() {
    Column {
        TutorialImage()
        TutorialTitle("Jetpack Compose tutorial")
        TutorialTextOne("Jetpack Compose is a modern toolkit for building native Android UI. Compose simplifies and accelerates UI development on Android with less code, powerful tools, and intuitive Kotlin APIs.")
        TutorialTextTwo("In this tutorial, you build a simple UI component with declarative functions. You call Compose functions to say what elements you want and the Compose compiler does the rest. Compose is built around Composable functions. These functions let you define your app\\'s UI programmatically because they let you describe how it should look and provide data dependencies, rather than focus on the process of the UI\\'s construction, such as initializing an element and then attaching it to a parent. To create a Composable function, you add the @Composable annotation to the function name.")
    }
}

@Composable
fun TutorialTitle(message: String) {
    Text(
        text = message,
        fontSize = 24.sp,
        modifier = Modifier
            .padding(16.dp)
    )
}

@Composable
fun TutorialTextOne(message: String) {
    Text(
        text = message,
        fontSize = 16.sp,
        textAlign = TextAlign.Justify,
        modifier = Modifier.padding(16.dp)
    )
}

@Composable
fun TutorialTextTwo(message: String) {
    Text(
        text = message,
        fontSize = 16.sp,
        textAlign = TextAlign.Justify,
        modifier = Modifier.padding(16.dp)
    )
}

@Composable
fun TutorialImage() {
    val image = painterResource(id = R.drawable.bg_compose_background)
    Image(
        painter = image,
        contentDescription = "Background Tutorial Compose"
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Tutorial()
}