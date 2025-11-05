package com.example.littlelemon

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.sp
import com.example.littlelemon.ui.theme.LittleLemonTheme

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LittleLemonTheme {
                Surface(
                    color = MaterialTheme.colorScheme.background
                ) {
                    // 👇 Call your new composable with:
                    // 1) string resource
                    // 2) font size 32
                    RestaurantName(
                        name = "Little Lemon",
                        size = 32
                    )
                }
            }
        }
    }
}

/**
 * Step 3 & 8:
 * New composable that takes:
 *  - name: String
 *  - size: Int (for font size in sp)
 */
@Composable
fun RestaurantName(name: String, size: Int) {
    Text(
        text = name,
        fontSize = size.sp
    )
}

/**
 * Step 6:
 * Preview for RestaurantName
 */
@Preview(showBackground = true)
@Composable
fun RestaurantNamePreview() {
    LittleLemonTheme {
        RestaurantName(
            name = "Little Lemon",
            size = 32
        )
    }
}