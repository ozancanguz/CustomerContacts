package com.ozancanguz.customercontacts.data.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.ozancanguz.customercontacts.R
import com.ozancanguz.customercontacts.data.db.Customer
import com.ozancanguz.customercontacts.data.db.CustomerDao
import com.ozancanguz.customercontacts.databinding.CustomerrecyclerviewRowlayoutBinding

class CustomerListAdapter : RecyclerView.Adapter<CustomerListAdapter.CustomerListViewHolder>() {

    private var customerList = emptyList<Customer>()

    fun setData(newData: List<Customer>) {
        this.customerList = newData
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomerListViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = CustomerrecyclerviewRowlayoutBinding.inflate(inflater, parent, false)
        return CustomerListViewHolder(binding)
    }

    override fun onBindViewHolder(holder: CustomerListViewHolder, position: Int) {
        val currentCustomer = customerList[position]
        holder.bind(currentCustomer)
    }

    override fun getItemCount(): Int {
        return customerList.size
    }

    inner class CustomerListViewHolder(private val binding: CustomerrecyclerviewRowlayoutBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(customer: Customer) {
            binding.textViewCustomerName.text = customer.customerName
            binding.textViewPhoneNumber.text = customer.customerNumber
        }
    }
}