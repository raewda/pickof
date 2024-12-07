package com.example.pickof.levels

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.FlowColumn
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
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.pickof.classes.gameButton
import com.example.pickof.ui.theme.Biryuzovyi
import com.example.pickof.ui.theme.Seryi
import com.example.pickof.ui.theme.Softblue
import com.example.pickof.ui.theme.gamaamli
import kotlin.random.Random

@OptIn(ExperimentalLayoutApi::class)
@Composable
fun Six(navController: NavHostController, resultsix: MutableState<Boolean>){
    var gamerpick by remember { mutableStateOf(0) }
    var gamepick by remember { mutableStateOf(0) }
    var game by remember { mutableStateOf(false) }

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
                    .fillMaxSize(),
                verticalArrangement = Arrangement.SpaceEvenly
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

                    Text("level 6",
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
                            navController.navigate("seven")
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
                } //row


                FlowColumn(
                    modifier = Modifier
                        .padding(innerPadding)
                        .padding(bottom = 50.dp)
                        .fillMaxSize(),
                    verticalArrangement = Arrangement.SpaceEvenly,
                    horizontalArrangement = Arrangement.Center,
                    maxItemsInEachColumn = 6
                ){
                    fun rand() : gameButton {
                        return gameButton.getById(Random.nextInt(1, 12))
                    }


                    for (i in 1..12){
                        var gamer by remember { mutableStateOf(false) }
                        Button(
                            modifier = Modifier
                                .padding(10.dp)
                                .size(70.dp, 40.dp),
                            onClick = {
                                game = true
                                gamepick = rand().id
                                gamer = true
                                gamerpick = i;
                                if (gamerpick == gamepick){
                                    resultsix.value = true
                                }
                            },
                            colors = ButtonDefaults.buttonColors(
                                containerColor = if (gamerpick == i && gamepick == i){
                                    Softblue
                                }
                                else if (gamepick == i){
                                    Softblue
                                }
                                else if (gamerpick == i){
                                    Color.White
                                }
                                else{
                                    Biryuzovyi
                                }
                            ),
                            shape = RoundedCornerShape(
                                10, 50, 10, 50)
                        ){}
                    }
                }

            } //column
        } // card
    } // scaffold
}