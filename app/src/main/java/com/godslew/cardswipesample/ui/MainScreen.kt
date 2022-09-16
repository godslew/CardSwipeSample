package com.godslew.cardswipesample.ui

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import com.godslew.cardswipesample.ui.content.MainContent

@Composable
internal fun MainScreen(
    modifier: Modifier = Modifier,
) {
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colorScheme.background
    ) {
        val items = remember { mutableStateListOf(*('A'..'Z').toList().toTypedArray()) }
        MainContent(
            contents = items.toList(),
        )
    }
}