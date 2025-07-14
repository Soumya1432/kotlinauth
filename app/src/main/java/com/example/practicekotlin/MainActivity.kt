package com.example.practicekotlin
import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.example.practicekotlin.ui.theme.PracticekotlinTheme

class MainActivity : ComponentActivity() {

    var sendIntent = Intent(Intent.ACTION_SEND)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // change the status bar color here
        window.statusBarColor = android.graphics.Color.parseColor("#6A11CB")
        setContent {
            PracticekotlinTheme {
                LoginScreen()
            }
        }
    }
}

@Composable
fun LoginScreen() {
    val gradientBrush = Brush.verticalGradient(
        colors = listOf(Color(0xFF6A11CB), Color(0xFF2575FC))
    )
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(gradientBrush),
        contentAlignment = Alignment.Center
    ) {

    }
}


@Preview(showBackground = true)
@Composable
fun LoginScreenPreview() {
    PracticekotlinTheme {
        LoginScreen()
    }
}
