package com.ozancanguz.customercontacts.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.viewModelScope
import com.ozancanguz.customercontacts.data.db.Customer
import com.ozancanguz.customercontacts.data.repository.Repository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class ContactListViewModel @Inject constructor(private val repository: Repository,application: Application):AndroidViewModel(application){





    // init get all customer list
    val customerList:LiveData<List<Customer>> = repository.local.getAllCustomerContact()

    // insert customer
    fun insertCustomer(customer: Customer){
        viewModelScope.launch {
            repository.local.insertCustomer(customer)
        }
    }


}