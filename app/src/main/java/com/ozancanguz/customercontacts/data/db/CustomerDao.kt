package com.ozancanguz.customercontacts.data.db

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
@Dao
interface CustomerDao {




    @Query("select*from customer_table order by id asc")
    fun getAllCustomerContact():LiveData<List<Customer>>

    @Insert
    suspend fun insertCustomer(customer: Customer)

}