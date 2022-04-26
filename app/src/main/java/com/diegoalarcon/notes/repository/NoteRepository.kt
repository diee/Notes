package com.diegoalarcon.notes.repository

import com.diegoalarcon.notes.data.NoteDao
import com.diegoalarcon.notes.model.Note
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.conflate
import kotlinx.coroutines.flow.flowOn
import javax.inject.Inject

class NoteRepository @Inject constructor(private val noteDao: NoteDao) {

    suspend fun addNote(note: Note) = noteDao.insert(note)
    suspend fun deleteNote(note: Note) = noteDao.deleteNote(note)
    fun getAllNotes(): Flow<List<Note>> =
        noteDao.getNotes().flowOn(Dispatchers.IO).conflate()
}