package com.example.practicekotlin
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight.Companion.W200
import androidx.compose.ui.text.font.FontWeight.Companion.W500
import androidx.compose.ui.text.font.FontWeight.Companion.W800
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.practicekotlin.ui.theme.PracticekotlinTheme

class MainActivity : ComponentActivity() {
    var sendIntent = Intent(Intent.ACTION_SEND)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // change the status bar color here
        window.statusBarColor = android.graphics.Color.parseColor("#6A11CB")
        setContent {
            PracticekotlinTheme {
                LoginScreen({})
                MergedData()
            }
        }
    }
}
@Composable
fun MergedData(){
    val a:Int = 23;
    val convetValue = a.toFloat();
    println(a);
}

//@Composable
//fun ArtistCardRow(artist:Artists){
//    Row(verticalAlignment = Alignment.CenterVertically) {
//        Image(bitmap = artist.image, contentDescription = "Artist Image")
//        Column {
//            Text(artist.name)
//        }
//    }
//}

//@Composable
//fun FilledButtonExample(onClick: () -> Unit) {
//    Button { }(onClick = { onClick() }) {
//        Text("Filled")
//    }
//}

@Composable
fun LoginScreen(onClick:()->Unit) {
    val gradientBrush = Brush.verticalGradient(
        colors = listOf(Color(0xFF6A11CB), Color(0xFF2575FC))
    )
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(gradientBrush),
        contentAlignment = Alignment.Center
    )
    {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(24.dp)
        ) {
       val ert:Int =673;
            val convert = ert.toFloat();

          val a:Int? = 1;
            val plusoperator ='+';
            val minusOperator = '-'
            Text(
                buildAnnotatedString {
                    withStyle(style = SpanStyle(color = Color.Red, fontSize = 48.sp, fontWeight = W500)){
                        append("India")
                        append(convert.toString());
                    }
                }
            )
            Text(
                buildAnnotatedString {
                    withStyle(style = SpanStyle(color = Color.White, fontSize = 48.sp, fontWeight = W200 )){
                        append("Welcome")
                    }
                }
            )
            Text(buildAnnotatedString {
                withStyle(style = SpanStyle(color = Color.Green, fontWeight = W800, fontSize = 34.sp )){
                    append("First")
                }
            })

        }




    }

}

fun Button(function: () -> Unit): Button {
    TODO("Not yet implemented")
}


@Preview(showBackground = true)
@Composable
fun LoginScreenPreview() {
    PracticekotlinTheme {
        LoginScreen({})
    }
}
