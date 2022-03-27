package com.zerdasoftware.navigationcomponent

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.navigation.Navigation
import androidx.navigation.fragment.navArgs
import kotlinx.android.synthetic.main.fragment_game.*
import kotlinx.android.synthetic.main.fragment_game.view.*
import kotlinx.android.synthetic.main.fragment_home.view.*


class GameFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val design = inflater.inflate(R.layout.fragment_game, container, false)
        val bundle:GameFragmentArgs by navArgs()

        val getName = bundle.name
        val getNumberInt = bundle.numberInt
        val getNumberFloat = bundle.numberFloat
        val getIsTrue = bundle.isTrue
        val getObject = bundle.userObject

        design.textViewData.setText(" Name: ${getName} " +
                                    "\n Number Int: ${getNumberInt} " +
                                    "\n Number Float: ${getNumberFloat}" +
                                    "\n Is True: ${getIsTrue}" +
                                    "\n Object Id: ${getObject.id}" +
                                    "\n Object Username: ${getObject.username}")

        design.buttonFinGame.setOnClickListener {

            Navigation.findNavController(it).navigate(R.id.actionGameToResult)
        }
        return design
    }
}