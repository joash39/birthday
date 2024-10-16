package com.example.birthdayapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.birthdayapp.ui.theme.BirthdayAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BirthdayAppTheme {

                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    GreetingPreview()


                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier.padding(24.dp)
    )
}

@Preview(showBackground = true,
    showSystemUi = true,
    name = "Birthday")
@Composable
fun GreetingPreview() {
    BirthdayAppTheme {
        /*GreetingText(message = "Congrats Joy for winning the award",
            from = "From Joash",
        modifier = Modifier.padding(16.dp)) */

        Surface(modifier = Modifier.fillMaxSize(),
                color = MaterialTheme.colorScheme.background
            ) {
            congratImage(
                message = stringResource(R.string.congrats_msg),
                from = stringResource(R.string.from_msg)
            )
        }
    }
}

@Composable
fun GreetingText(message: String,from: String, modifier: Modifier = Modifier) {

    Column(verticalArrangement = Arrangement.Center,
        modifier = modifier,

        ) {
        Text(
            text = message,
            fontSize = 50.sp,
            lineHeight = 50.sp,
            textAlign = TextAlign.Center
        )
        Text(
            text = from,
            fontSize = 36.sp,
            modifier = Modifier
                .padding(16.dp)
                .align(alignment = Alignment.CenterHorizontally),


            )
    }
}


@Composable
fun congratImage(message: String,from: String, modifier: Modifier = Modifier){
    val image = painterResource(id = R.drawable.congratulation)


    Box(modifier.fillMaxSize()) {
        Image(
            painter = image,
            contentDescription = null,
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.Crop,
            // alpha = 0.5F, -> Opacity changes



        )
        GreetingText(message = "Happy Birthday Juliet", from = "From Romio",
        modifier = Modifier.fillMaxSize().padding(16.dp),


            )
    }



}



