package com.example.weatherapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.weatherapp.ui.theme.DarkBlue
import com.example.weatherapp.ui.theme.WeatherAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            WeatherAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    // Replace Greeting here with Weather Page
                    WeatherPage()
                }
            }
        }
    }
}
// Step 2. Remove Greeting and replace with Weather Page
@Composable
fun WeatherPage() {
    // Step 5. Add this to a column
    Column(
        modifier = Modifier
            .fillMaxWidth()
            //step 6. Add padding and alignment
            .padding(top = 64.dp, start = 16.dp, end = 16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    )
    {
        HeaderImage()
        MainInfo()
    }

}
//s7 Define the mian page component
@Composable

fun MainInfo(){
    //s8. Creta a column and add a text. Talk about special Characters. Also the colors file
    Column() {
        Text(text = "11"+'\u00B0', color = DarkBlue)
    }

}

// Step Three- Add Header Image Composable. Add Image to the res folder.
@Composable
fun HeaderImage(){

    // Build first in order for the image to render
    Image(
        painter = painterResource(id = R.drawable.ic_couple),
        contentDescription = null,
        //step6; add modifier to width of image
        modifier =Modifier.width(200.dp)
    )
}
// Step 1. Change the size of the default preview.
@Preview(showBackground = true ,widthDp =390, heightDp= 800)
@Composable
fun DefaultPreview() {
    WeatherAppTheme {
        WeatherPage()
    }
}