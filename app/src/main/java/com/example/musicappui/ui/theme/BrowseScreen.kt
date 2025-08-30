package com.example.musicappui.ui.theme


import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.musicappui.R

@Composable
fun BrowseScreen(){
    val categories = listOf("Hits","Happy","Workout","Cyber","Romance","Trending")
    LazyVerticalGrid(columns = GridCells.Fixed(2))
    {
        items(categories) { cat ->
           BrowserItem(cat = cat, drawable = R.drawable.baseline_open_in_browser_24)
        }
    }

}

@Preview(showBackground = true)
@Composable
fun BrowseScreenPreview(){
    Surface {
        BrowseScreen()
    }
}