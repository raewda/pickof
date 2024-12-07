package com.example.pickof.levels

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.pickof.ui.theme.Biryuzovyi
import com.example.pickof.ui.theme.Seryi
import com.example.pickof.ui.theme.gamaamli

@Composable
fun Three(navController: NavHostController, resultthree: MutableState<Boolean>){
    Scaffold(
        modifier = Modifier.fillMaxSize(),
        containerColor = Seryi
    ) { innerPadding ->
        Card(
            modifier = Modifier
                .fillMaxSize(),
            colors = CardDefaults.cardColors(Seryi)
        ) {
            Column(
                modifier = Modifier
                    .padding(innerPadding)
            ) {

                Row(
                    modifier = Modifier
                        .fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Button(
                        modifier = Modifier
                            .padding(10.dp)
                            .size(80.dp, 40.dp),
                        onClick = {
                            navController.navigate("home")
                        },
                        colors = ButtonDefaults.buttonColors(Biryuzovyi),
                        shape = RoundedCornerShape(
                            10, 50, 10, 50)
                    ) {
                        Text("<",
                            modifier = Modifier,
                            fontSize = 20.sp,
                            fontFamily = gamaamli,
                            color = Color.White)
                    }

                    Text("level 3",
                        modifier = Modifier,
                        color = Color.White,
                        textAlign = TextAlign.Center,
                        fontFamily = gamaamli,
                        fontSize = 50.sp,
                        lineHeight = 37.sp
                    )

                    Button(
                        modifier = Modifier
                            .padding(10.dp)
                            .size(80.dp, 40.dp),
                        onClick = {
                            navController.navigate("four")
                        },
                        colors = ButtonDefaults.buttonColors(Biryuzovyi),
                        shape = RoundedCornerShape(
                            50, 10, 50, 10)
                    ) {
                        Text(">",
                            modifier = Modifier,
                            fontSize = 20.sp,
                            fontFamily = gamaamli,
                            color = Color.White)
                    }
                }


            }
        }
    }
}