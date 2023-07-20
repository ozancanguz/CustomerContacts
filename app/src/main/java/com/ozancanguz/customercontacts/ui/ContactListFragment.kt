package com.ozancanguz.customercontacts.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.ozancanguz.customercontacts.R
import com.ozancanguz.customercontacts.databinding.FragmentContactListBinding


class ContactListFragment : Fragment() {
    private var _binding: FragmentContactListBinding? = null

    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentContactListBinding.inflate(inflater, container, false)
        val view = binding.root


        return view
    }


}