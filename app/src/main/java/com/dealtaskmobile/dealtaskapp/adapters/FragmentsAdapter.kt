package com.dealtaskmobile.dealtaskapp.adapters

import android.content.res.Resources
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.dealtaskmobile.dealtaskapp.Favorite
import com.dealtaskmobile.dealtaskapp.Home

class FragmentsAdapter(fragment: FragmentActivity) : FragmentStateAdapter(fragment) {
    override fun getItemCount(): Int = 2

    override fun createFragment(position: Int): Fragment {
        when (position) {
            0 -> return Home()
            1 -> return Favorite()
            else -> {throw Resources.NotFoundException("Position Not Found")}
        }
    }
}