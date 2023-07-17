package com.pet.cleanarchitecturenoteapp.feature_note.domain.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.pet.cleanarchitecturenoteapp.ui.theme.BabyBlue
import com.pet.cleanarchitecturenoteapp.ui.theme.LightGreen
import com.pet.cleanarchitecturenoteapp.ui.theme.RedOrange
import com.pet.cleanarchitecturenoteapp.ui.theme.RedPink
import com.pet.cleanarchitecturenoteapp.ui.theme.Violet

@Entity
data class Note(
    val title: String,
    val content: String,
    val timestamp: Long,
    val color: Int,
    @PrimaryKey val id: Int? = null
) {
    companion object {
        val noteColors = listOf(
            RedOrange, LightGreen, Violet, BabyBlue, RedPink
        )
    }
}

class InvalidNoteException(message: String) : Exception(message)
