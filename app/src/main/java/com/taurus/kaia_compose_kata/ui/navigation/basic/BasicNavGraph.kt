package com.taurus.kaia_compose_kata.ui.navigation.basic

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost

@Composable
fun BasicNavGraph(
    navController: NavHostController
) {
    NavHost(
        navController = navController,
        startDestination = "" // Choose the start destination here
    ) {
        // Make use of composable to define the route

    }
}