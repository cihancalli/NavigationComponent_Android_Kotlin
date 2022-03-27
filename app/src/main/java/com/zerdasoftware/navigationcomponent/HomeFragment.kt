package com.zerdasoftware.navigationcomponent

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_home.view.*

class HomeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val design = inflater.inflate(R.layout.fragment_home, container, false)

        design.buttonHomeStart.setOnClickListener {
            val user = Users(1,"Cihan")
            val transition = HomeFragmentDirections.actionHomeToGame("Cihan",30,1.7f,true,user)
            //Navigation.findNavController(it).navigate(R.id.actionHomeToGame)
            Navigation.findNavController(it).navigate(transition)
        }
        return design
    }
}