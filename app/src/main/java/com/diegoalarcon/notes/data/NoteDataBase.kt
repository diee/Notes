package com.diegoalarcon.notes.data

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.diegoalarcon.notes.model.Note

@Database(entities = [Note::class], version = 1, exportSchema = false)
@TypeConverters(DataBaseConverter::class)
abstract class NoteDataBase : RoomDatabase() {
    abstract fun noteDao(): NoteDao
}