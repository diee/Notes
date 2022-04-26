package com.diegoalarcon.notes.data

import com.diegoalarcon.notes.model.Note

class NotesDataSource {
    fun loadNotes(): List<Note> {
        val notes = mutableListOf<Note>()
        for (i in 1..10) {
            notes.add(Note(title = "Title $i", description = "Description $i"))
        }
        return notes
    }
}