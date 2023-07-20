package com.ozancanguz.customercontacts.ui

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.ozancanguz.customercontacts.R
import com.ozancanguz.customercontacts.data.db.Customer
import com.ozancanguz.customercontacts.databinding.FragmentContactBinding
import com.ozancanguz.customercontacts.viewmodel.ContactListViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class ContactFragment : Fragment() {
    private var _binding: FragmentContactBinding? = null

    private val binding get() = _binding!!

    private val contactListViewModel:ContactListViewModel by viewModels()


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentContactBinding.inflate(inflater, container, false)
        val view = binding.root



        saveCustomer()


        return view
    }

    private fun saveCustomer() {
        binding.buttonSave.setOnClickListener {
            val customerName=binding.editTextCustomerName.text.toString()
            val customerPhoneNumber=binding.editTextPhoneNumber.text.toString()

           val customer= Customer(0,customerName,customerPhoneNumber)

            contactListViewModel.insertCustomer(customer)
            Log.d("check","Data Added " +customerName)

            findNavController().navigate(R.id.action_contactFragment_to_contactListFragment)

        }
    }


}