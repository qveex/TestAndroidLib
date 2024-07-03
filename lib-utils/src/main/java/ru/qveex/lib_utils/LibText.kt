package ru.qveex.lib_utils

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun LibText(
    modifier: Modifier = Modifier,
    textColor: Color = Color.Unspecified,
    text: String
) {
    Text(
        modifier= modifier,
        text = text,
        style = MaterialTheme.typography.headlineLarge,
        color = textColor
    )
}

@Preview
@Composable
private fun PreviewLibText() {
    MaterialTheme {
        LibText(text = "Test")
    }
}