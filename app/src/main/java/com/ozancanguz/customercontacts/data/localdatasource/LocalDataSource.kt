package com.ozancanguz.customercontacts.data.localdatasource

import androidx.lifecycle.LiveData
import com.ozancanguz.customercontacts.data.db.Customer
import com.ozancanguz.customercontacts.data.db.CustomerDao
import javax.inject.Inject

class LocalDataSource@Inject constructor(private val customerDao: CustomerDao ) {



    fun getAllCustomerContact():LiveData<List<Customer>>{
        return customerDao.getAllCustomerContact()
    }

    suspend fun insertCustomer(customer: Customer){
        return customerDao.insertCustomer(customer)
    }


}