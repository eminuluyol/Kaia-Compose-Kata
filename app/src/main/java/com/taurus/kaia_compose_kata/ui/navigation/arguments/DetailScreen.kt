package com.taurus.kaia_compose_kata.ui.navigation.arguments

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview

// TODO - 15: How do we fix the backstack problem?
// Hint: https://developer.android.com/jetpack/compose/navigation

@Composable
fun DetailScreen(id: Int?, name: String?) {
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Text(
            // Hint: To add a click event make use of a Modifier
            text = "Detail id: $id name: $name",
            color = MaterialTheme.colors.secondaryVariant,
            fontSize = MaterialTheme.typography.h3.fontSize,
            fontWeight = FontWeight.Bold
        )
    }
}

@Composable
@Preview(showBackground = true)
fun DetailScreenPreview() {
    DetailScreen(20,"Name")
}