package com.ozancanguz.customercontacts.data.db

import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.TypeConverters


@Database(entities = [Customer::class], version = 1, exportSchema = false)

@TypeConverters(TypeConverter::class)
abstract class CustomerDatabase:RoomDatabase() {

    abstract fun customerDao():CustomerDao


}