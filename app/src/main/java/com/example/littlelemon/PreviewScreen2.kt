// Kotlin
package com.example.littlelemon.ui

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun Greeting(name: String) {
    MaterialTheme {
        Text(text = "Hello, $name!")
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Greeting(name = "Little Lemon from Simiel")
}
