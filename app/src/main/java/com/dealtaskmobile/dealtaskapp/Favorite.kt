package com.dealtaskmobile.dealtaskapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.dealtaskmobile.signin.R
import com.dealtaskmobile.signin.databinding.FragmentFavoriteBinding
import com.dealtaskmobile.signin.databinding.FragmentHomeBinding
import com.google.android.gms.tasks.Task


class Favorite : Fragment() {

    private var binding: FragmentFavoriteBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentFavoriteBinding.inflate(inflater, container, false)
        val view = binding?.root
        return view
    }


    companion object {

        @JvmStatic
        fun newInstance() = Favorite()
    }
}