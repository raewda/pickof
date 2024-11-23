package com.example.pickof.levels

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import com.example.pickof.ui.theme.Seryi

@Composable
fun Four(navHostController: NavHostController){
    Scaffold(
        modifier = Modifier.fillMaxSize(),
        containerColor = Seryi
    ) { innerPadding ->
        Card {
            Column(
                modifier = Modifier
                    .padding(innerPadding)
            ) {

            }
        }
    }
}