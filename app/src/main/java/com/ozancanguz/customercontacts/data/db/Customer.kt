package com.ozancanguz.customercontacts.data.db

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "customer_table")
data class Customer (
    @PrimaryKey(autoGenerate = true)
    var id:Int=0,
    var customerName:String,
    var customerNumber:String,
        )


