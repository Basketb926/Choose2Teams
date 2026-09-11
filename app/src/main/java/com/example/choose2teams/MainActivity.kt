package com.example.choose2teams

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.choose2teams.ui.theme.Choose2TeamsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Choose2TeamsTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    SportsLeaguesScreen(modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}
