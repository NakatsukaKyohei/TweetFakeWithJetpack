package com.example.tweetfakewithjetpack

import androidx.compose.foundation.layout.systemBarsPadding
import androidx.compose.material.SnackbarHost
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.tweetfakewithjetpack.ui.theme.TweetFakeTheme

@Composable
public fun TweetFakeApp(): Unit{
    TweetFakeTheme {
        val navController = rememberNavController()

        TweetFakeNavHost(navController = navController)
    }
}

@Composable
fun TweetFakeNavHost(
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController(),
    startDestination: String = "timeline"
) {
    NavHost(
        modifier = modifier,
        navController = navController,
        startDestination = startDestination
    ) {
        composable("timeline") { TimelineScreen() }
        composable("search") { SearchScreen() }
        composable("alert") { AlertScreen() }
        composable("message") { MessageScreen() }
    }
}


@Composable
fun TimelineScreen(){

}

@Composable
fun SearchScreen() {
//    /*...*/
//    Button(onClick = onNavigateToFriends) {
//        Text(text = "See friends list")
//    }
}

@Composable
fun AlertScreen(){

}

@Composable
fun MessageScreen(){

}