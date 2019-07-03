package com.example.android.navigation


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.databinding.DataBindingUtil


class TitleFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        //Inflating and Returning the View with DataBindingUtil
            val binding = DataBindingUtil.inflate<com.example.android.navigation.databinding.FragmentTitleBinding>(inflater, R.layout.fragment_title, container, false)
            return binding.root

    }


}
