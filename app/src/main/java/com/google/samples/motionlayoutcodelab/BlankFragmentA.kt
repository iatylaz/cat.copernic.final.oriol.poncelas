package com.google.samples.poncelas

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_blank_a.*

class BlankFragmentA : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        return inflater.inflate(R.layout.fragment_blank_a, container, false)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        super.onCreate(savedInstanceState)
        button_f1.setOnClickListener{
            findNavController().navigate(R.id.action_blankFragmentA_to_blankFragmentB)
        }


        button_f11.setOnClickListener{
            findNavController().navigate(R.id.action_blankFragmentA_to_blankFragmentC)
        }


    }




}