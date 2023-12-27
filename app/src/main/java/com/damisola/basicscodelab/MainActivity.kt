package com.damisola.basicscodelab

import android.content.res.Configuration.UI_MODE_NIGHT_YES
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.core.Spring
import androidx.compose.animation.core.animateDpAsState
import androidx.compose.animation.core.spring
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.damisola.basicscodelab.ui.theme.BasicsCodelabTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BasicsCodelabTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    MyApp()
                }
            }
        }
    }
}

//@Composable
//fun Greeting(name: String) {
  // var expanded by remember { mutableStateOf(false) }

  //  val extraPadding by animateDpAsState(
  //      if (expanded) 48.dp else 0.dp,
  //      animationSpec = spring(
  //          dampingRatio = Spring.DampingRatioMediumBouncy,
  //          stiffness = Spring.StiffnessLow
  //      )
 //   )
 //   Surface(
 //       color = MaterialTheme.colorScheme.primary,
 //       modifier = Modifier.padding(vertical = 4.dp, horizontal = 8.dp)
 //   ) {
  //      Row(modifier = Modifier.padding(24.dp)){
  //          Column(modifier = Modifier
   //             .weight(1f)
    //            .padding(bottom = extraPadding.coerceAtLeast(0.dp))
    //        ) {
    //            Text(text = "Hello,")
      //          Text(text = name, style = MaterialTheme.typography.headlineMedium.copy(
      //              fontWeight = FontWeight.ExtraBold
      //          ))
      //      }
       //     ElevatedButton(
       //         onClick = { expanded =!expanded }
       //     ) {
       //         Text( if (expanded) "Show less" else "Show more")

       //     }
     //   }
   // }
//}
@Preview(
    showBackground = true,
    widthDp = 320,
    uiMode = UI_MODE_NIGHT_YES,
    name = "GreetingPreviewDark"
)
@Preview(showBackground = true, widthDp = 320)
@Composable
fun GreetingPreview(){
    BasicsCodelabTheme {
        Greetings()
    }
}
@Preview(showBackground = true, widthDp = 320, heightDp = 320)
@Composable
fun DefaultPreview() {
    BasicsCodelabTheme {
        OnboardingScreen(onContinueClicked = { /*TODO*/ })
    }
}
@Preview
@Composable
fun MyAppPreview(){
    BasicsCodelabTheme {
        MyApp(Modifier.fillMaxSize())
    }
}