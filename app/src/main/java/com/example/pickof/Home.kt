package com.example.pickof

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.pickof.ui.theme.Biryuzovyi
import com.example.pickof.ui.theme.Seryi
import com.example.pickof.ui.theme.Typography
import com.example.pickof.ui.theme.gamaamli

@Composable
fun Home(navController: NavHostController){
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
                    .padding(bottom = 60.dp)
                    .fillMaxSize()
                    .verticalScroll(rememberScrollState()),
                verticalArrangement = Arrangement.SpaceBetween,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {

                Text("PICK PICK PICK PICK PICK",
                    modifier = Modifier
                        .padding(horizontal = 25.dp),
                    color = Color.White,
                    textAlign = TextAlign.Center,
                    fontFamily = gamaamli,
                    fontSize = 30.sp,
                    lineHeight = 37.sp,
                    softWrap = true
                )

                //1
                Button(
                    modifier = Modifier
                        .padding(10.dp)
                        .fillMaxWidth(),
                    colors = ButtonDefaults.buttonColors(Biryuzovyi),
                    onClick = {
                        navController.navigate("one")
                    }
                ) {
                    Text("path 1",
                        modifier = Modifier,
                        style = Typography.bodySmall,
                        color = Color.White)
                }
                Text("PROGRESS:",
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 30.dp),
                    fontFamily = gamaamli,
                    fontSize = 18.sp,
                    color = Color.White
                    )

                //2
                Button(
                    modifier = Modifier
                        .padding(10.dp)
                        .fillMaxWidth(),
                    colors = ButtonDefaults.buttonColors(Biryuzovyi),
                    onClick = {
                        navController.navigate("two")
                    }
                ) {
                    Text("path 2",
                        modifier = Modifier,
                        style = Typography.bodySmall,
                        color = Color.White)
                }
                Text("PROGRESS:",
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 30.dp),
                    fontFamily = gamaamli,
                    fontSize = 18.sp,
                    color = Color.White
                )

                //3
                Button(
                    modifier = Modifier
                        .padding(10.dp)
                        .fillMaxWidth(),
                    colors = ButtonDefaults.buttonColors(Biryuzovyi),
                    onClick = {
                        navController.navigate("three")
                    }
                ) {
                    Text("path 3",
                        modifier = Modifier,
                        style = Typography.bodySmall,
                        color = Color.White)
                }
                Text("PROGRESS:",
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 30.dp),
                    fontFamily = gamaamli,
                    fontSize = 18.sp,
                    color = Color.White
                )

                //4
                Button(
                    modifier = Modifier
                        .padding(10.dp)
                        .fillMaxWidth(),
                    colors = ButtonDefaults.buttonColors(Biryuzovyi),
                    onClick = {
                        navController.navigate("four")
                    }
                ) {
                    Text("path 4",
                        modifier = Modifier,
                        style = Typography.bodySmall,
                        color = Color.White)
                }
                Text("PROGRESS:",
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 30.dp),
                    fontFamily = gamaamli,
                    fontSize = 18.sp,
                    color = Color.White
                )

                //5
                Button(
                    modifier = Modifier
                        .padding(10.dp)
                        .fillMaxWidth(),
                    colors = ButtonDefaults.buttonColors(Biryuzovyi),
                    onClick = {
                        navController.navigate("five")
                    }
                ) {
                    Text("path 5",
                        modifier = Modifier,
                        style = Typography.bodySmall,
                        color = Color.White)
                }
                Text("PROGRESS:",
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 30.dp),
                    fontFamily = gamaamli,
                    fontSize = 18.sp,
                    color = Color.White
                )

                //6
                Button(
                    modifier = Modifier
                        .padding(10.dp)
                        .fillMaxWidth(),
                    colors = ButtonDefaults.buttonColors(Biryuzovyi),
                    onClick = {
                        navController.navigate("six")
                    }
                ) {
                    Text("path 6",
                        modifier = Modifier,
                        style = Typography.bodySmall,
                        color = Color.White)
                }
                Text("PROGRESS:",
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 30.dp),
                    fontFamily = gamaamli,
                    fontSize = 18.sp,
                    color = Color.White
                )

                //7
                Button(
                    modifier = Modifier
                        .padding(10.dp)
                        .fillMaxWidth(),
                    colors = ButtonDefaults.buttonColors(Biryuzovyi),
                    onClick = {
                        navController.navigate("seven")
                    }
                ) {
                    Text("path 7",
                        modifier = Modifier,
                        style = Typography.bodySmall,
                        color = Color.White)
                }
                Text("PROGRESS:",
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 30.dp),
                    fontFamily = gamaamli,
                    fontSize = 18.sp,
                    color = Color.White
                )

                //8
                Button(
                    modifier = Modifier
                        .padding(10.dp)
                        .fillMaxWidth(),
                    colors = ButtonDefaults.buttonColors(Biryuzovyi),
                    onClick = {
                        navController.navigate("eight")
                    }
                ) {
                    Text("path 8",
                        modifier = Modifier,
                        style = Typography.bodySmall,
                        color = Color.White)
                }
                Text("PROGRESS:",
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 30.dp),
                    fontFamily = gamaamli,
                    fontSize = 18.sp,
                    color = Color.White
                )

                //9
                Button(
                    modifier = Modifier
                        .padding(10.dp)
                        .fillMaxWidth(),
                    colors = ButtonDefaults.buttonColors(Biryuzovyi),
                    onClick = {
                        navController.navigate("nine")
                    }
                ) {
                    Text("path 9",
                        modifier = Modifier,
                        style = Typography.bodySmall,
                        color = Color.White)
                }
                Text("PROGRESS:",
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 30.dp),
                    fontFamily = gamaamli,
                    fontSize = 18.sp,
                    color = Color.White
                )

            }
        }
    }
}
