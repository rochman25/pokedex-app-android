package com.dicoding.picodiploma.pokedex.data

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class pokemon(
    val name: String,
    val type: Array<String>,
    val sprite: String,
    val height: Float,
    val weight: Float,
    val description: String,
): Parcelable