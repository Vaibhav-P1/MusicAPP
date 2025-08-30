package com.example.musicappui

import androidx.annotation.DrawableRes

data class Lib(@DrawableRes val icon : Int,val name: String)

val libraries = listOf<Lib>(
    Lib(R.drawable.baseline_queue_music_24,"Playlist"),
    Lib(R.drawable.baseline_mic_24,"Artist"),
    Lib(R.drawable.baseline_catching_pokemon_24,"Album"),
    Lib(R.drawable.baseline_audiotrack_24,"Songs"),
    Lib(R.drawable.baseline_connect_without_contact_24,"Genre")

)
