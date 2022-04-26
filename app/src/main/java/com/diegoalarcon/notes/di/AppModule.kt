package com.diegoalarcon.notes.di

import android.content.Context
import androidx.room.Room
import com.diegoalarcon.notes.data.NoteDao
import com.diegoalarcon.notes.data.NoteDataBase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
object AppModule {

    @Singleton
    @Provides
    fun provideNotesDao(noteDataBase: NoteDataBase): NoteDao = noteDataBase.noteDao()

    @Singleton
    @Provides
    fun provideAppDataBase(@ApplicationContext context: Context): NoteDataBase {
        return Room.databaseBuilder(
            context,
            NoteDataBase::class.java,
            "notes"
        ).fallbackToDestructiveMigration().build()
    }
}