package com.ozancanguz.customercontacts.data.db

import com.google.gson.Gson
import com.google.gson.reflect.TypeToken

class TypeConverter {

    var gson = Gson()

    @androidx.room.TypeConverter
    fun ProductListToString(customer:List<Customer>): String {
        return gson.toJson(customer)
    }

    @androidx.room.TypeConverter
    fun stringToProductList(data: String): List<Customer> {
        val listType = object : TypeToken<List<Customer>>() {}.type
        return gson.fromJson(data, listType)
    }
}