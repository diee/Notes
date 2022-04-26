package com.diegoalarcon.notes.data

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy.REPLACE
import androidx.room.Query
import com.diegoalarcon.notes.model.Note
import kotlinx.coroutines.flow.Flow

@Dao
interface NoteDao {

    @Query("SELECT * from note")
    fun getNotes(): Flow<List<Note>>

    @Insert(onConflict = REPLACE)
    suspend fun insert(note: Note)

    @Delete
    suspend fun deleteNote(note: Note)
}