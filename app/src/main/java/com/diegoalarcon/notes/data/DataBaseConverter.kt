package com.diegoalarcon.notes.data

import androidx.room.TypeConverter
import java.util.*

class DataBaseConverter {
    @TypeConverter
    fun timeStampFromDate(date: Date): Long {
        return date.time
    }

    @TypeConverter
    fun dateFromTimeStamp(timeStamp: Long): Date {
        return Date(timeStamp)
    }

    @TypeConverter
    fun fromUUID(uuid: UUID): String? {
        return uuid.toString()
    }

    @TypeConverter
    fun uuidFromString(string: String?): UUID? {
        return UUID.fromString(string)
    }
}