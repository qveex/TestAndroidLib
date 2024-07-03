package ru.qveex.testlib

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import ru.qveex.lib_screen.LibScreen
import ru.qveex.testlib.ui.theme.TestLibTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            TestLibTheme {
                LibScreen(
                    title = "Lib",
                    btn = "Click",
                    onClick = { Log.e("Lib", "Click") }
                )
            }
        }
    }
}

