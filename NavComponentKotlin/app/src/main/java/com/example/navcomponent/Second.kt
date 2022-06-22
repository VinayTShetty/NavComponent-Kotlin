package com.example.navcomponent

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation

class Second : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_second, container, false)
      val secondBtn=  view.findViewById<Button>(R.id.secondfragbutton)
        secondBtn.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_second_to_frist)
        }
        return view
    }
}