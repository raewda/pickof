package com.example.pickof

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.pickof.ui.theme.Biryuzovyi
import com.example.pickof.ui.theme.PickOfTheme
import com.example.pickof.ui.theme.Seryi
import com.example.pickof.ui.theme.Typography
import com.example.pickof.ui.theme.gamaamli

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            PickOfTheme {
                Scaffold(
                    modifier = Modifier.fillMaxSize(),
                    containerColor = Seryi
                )
                { innerPadding ->
                   Card(
                       modifier = Modifier
                           .fillMaxSize()
                           .padding(innerPadding),
                       colors = CardDefaults.cardColors(Seryi)
                   ){
                       Column(
                           modifier = Modifier
                               .fillMaxSize(),
                           verticalArrangement = Arrangement.SpaceBetween,
                           horizontalAlignment = Alignment.CenterHorizontally
                       ) {

                           Text(
                               text = "RAEWDA PRODUCTION",
                               modifier = Modifier
                                   .fillMaxWidth(),
                               style = Typography.bodySmall,
                               color = Color.White
                           )

                            Image(
                                painter = painterResource(R.drawable.iccon),
                                contentDescription = "img",
                                alignment = Alignment.Center,
                                modifier = Modifier
                                    .size(370.dp),
                            )

                           Text("PICK AND HAVE TIME, CLOSE ALL PLANS\n PICK PICK PICK PICK PICK",
                               modifier = Modifier
                                   .padding(horizontal = 25.dp),
                               color = Color.White,
                               textAlign = TextAlign.Center,
                               fontFamily = gamaamli,
                               fontSize = 36.sp,
                               lineHeight = 37.sp,
                               softWrap = true
                               )

                           Button(
                               modifier = Modifier
                                   .padding(bottom = 60.dp)
                                   .size(120.dp),
                               colors = ButtonDefaults.buttonColors(Biryuzovyi),
                               onClick = {
                                   
                               }
                           ) {
                               Text("PICK",
                                   modifier = Modifier,
                                   style = Typography.bodySmall,
                                   color = Color.White)
                           }
                       }
                   }
                }
            }
        }
    }
}
