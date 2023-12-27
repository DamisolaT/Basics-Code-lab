package com.damisola.basicscodelab

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun MyApp(modifier :Modifier = Modifier){
    var shouldShowOnboarding by remember { mutableStateOf(true) }
    Surface(modifier){
        if (shouldShowOnboarding){
            OnboardingScreen(onContinueClicked = { shouldShowOnboarding = false})
        } else {

            Greetings()
        }
    }
}


@Composable
fun Greetings(
    modifier :Modifier = Modifier,
    names: List<String> = List(1000){ "$it"}
    ){
        LazyColumn(modifier = modifier.padding(vertical = 4.dp)) {
            items (items = names){ name ->
                Greeting(name = name)
            }
        }
    }

@Composable
 fun Greeting(name: String, modifier: Modifier = Modifier){
     Card(
         colors = CardDefaults.cardColors(
             containerColor = MaterialTheme.colorScheme.primary
         ),
         modifier = modifier.padding(vertical = 4.dp, horizontal = 8.dp)
     ){
         CardContent(name)
     }

 }
