package ru.qveex.lib_utils

import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun LibButton(
    modifier: Modifier = Modifier,
    text: String,
    onClick: () -> Unit
) {
    Button(
        modifier = modifier,
        onClick = onClick
    ) {
        LibText(text = text)
    }
}

@Preview
@Composable
private fun PreviewLibButton() {
    MaterialTheme {
        LibButton(
            text = "Preview",
            onClick = {},
        )
    }
}