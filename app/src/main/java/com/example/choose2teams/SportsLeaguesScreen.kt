package com.example.choose2teams

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.choose2teams.ui.theme.Choose2TeamsTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SportsLeaguesScreen(modifier: Modifier = Modifier) {
    var expanded by remember { mutableStateOf(false) }
    var selectedLeague by remember { mutableStateOf<League?>(null) }
    var randomTeams by remember { mutableStateOf<List<String>>(emptyList()) }

    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Choose a League",
            style = MaterialTheme.typography.headlineMedium,
            modifier = Modifier.padding(bottom = 16.dp)
        )

        ExposedDropdownMenuBox(
            expanded = expanded,
            onExpandedChange = { expanded = !expanded }
        ) {
            TextField(
                value = selectedLeague?.name ?: "Select League",
                onValueChange = {},
                readOnly = true,
                trailingIcon = { ExposedDropdownMenuDefaults.TrailingIcon(expanded = expanded) },
                modifier = Modifier.menuAnchor()
            )

            ExposedDropdownMenu(
                expanded = expanded,
                onDismissRequest = { expanded = false }
            ) {
                SportsData.leagues.forEach { league ->
                    DropdownMenuItem(
                        text = { Text(league.name) },
                        onClick = {
                            selectedLeague = league
                            expanded = false
                            randomTeams = league.teams.shuffled().take(2)
                        }
                    )
                }
            }
        }

        Spacer(modifier = Modifier.height(32.dp))

        if (randomTeams.isNotEmpty()) {
            Text(
                text = "Randomly Selected Teams:",
                style = MaterialTheme.typography.titleLarge
            )
            Spacer(modifier = Modifier.height(16.dp))
            randomTeams.forEach { team ->
                Text(
                    text = team,
                    style = MaterialTheme.typography.bodyLarge,
                    modifier = Modifier.padding(vertical = 4.dp)
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun SportsLeaguesScreenPreview() {
    Choose2TeamsTheme {
        SportsLeaguesScreen()
    }
}
