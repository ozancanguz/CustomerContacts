package com.ozancanguz.customercontacts.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.ozancanguz.customercontacts.R
import com.ozancanguz.customercontacts.databinding.FragmentContactListBinding
import com.ozancanguz.customercontacts.viewmodel.ContactListViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint

class ContactListFragment : Fragment() {
    private var _binding: FragmentContactListBinding? = null

    private val binding get() = _binding!!

    // init view model
    private val contactListViewModel:ContactListViewModel by viewModels()




    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentContactListBinding.inflate(inflater, container, false)
        val view = binding.root


        binding.button.setOnClickListener {

            findNavController().navigate(R.id.action_contactListFragment_to_contactFragment)
        }

        return view
    }


}