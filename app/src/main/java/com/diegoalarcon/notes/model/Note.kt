package com.diegoalarcon.notes.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.time.Instant
import java.util.*

@Entity
data class Note(
    @PrimaryKey
    val id: UUID = UUID.randomUUID(),
    val title: String,
    val description: String,
    val entryDate: Date = Date.from(Instant.now())
)
