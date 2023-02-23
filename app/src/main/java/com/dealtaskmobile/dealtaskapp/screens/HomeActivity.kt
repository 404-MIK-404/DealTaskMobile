package com.dealtaskmobile.dealtaskapp.screens

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import androidx.viewpager2.widget.ViewPager2
import androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
import com.dealtaskmobile.dealtaskapp.adapters.FragmentsAdapter
import com.dealtaskmobile.dealtaskapp.app.App
import com.dealtaskmobile.dealtaskapp.viewmodel.DealTaskViewModel
import com.dealtaskmobile.dealtaskapp.viewmodel.DealTaskViewModelFactory
import com.dealtaskmobile.signin.R
import com.dealtaskmobile.signin.databinding.ActivityHomeBinding
import com.google.android.material.bottomnavigation.BottomNavigationView
import javax.inject.Inject

class HomeActivity : AppCompatActivity() {


    @Inject
    lateinit var vmFactory: DealTaskViewModelFactory

    private var binding: ActivityHomeBinding? = null

    private var viewPageFragments: ViewPager2? = null

    private var bottomNavigationView: BottomNavigationView? = null

    private var vm: DealTaskViewModel? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_home)
        (applicationContext as App).appComponent.inject(this)
        vm = ViewModelProvider(this,vmFactory).get(DealTaskViewModel::class.java)
        init()
        setUpViewPager()
    }

    private fun init(){
        bottomNavigationView = findViewById(R.id.bottomNavigationView)
        viewPageFragments = findViewById(R.id.viewPageFragments)
        viewPageFragments?.adapter = FragmentsAdapter(this)
        bottomNavigationView?.setOnNavigationItemSelectedListener(taskNavigationItemSelectedListener)
    }

    private val taskNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->
        when (item.itemId) {
            R.id.selectHome -> viewPageFragments?.currentItem = 0
            R.id.selectFavorite -> viewPageFragments?.currentItem = 1
        }
        false
    }

    private fun setUpViewPager(){
        viewPageFragments?.registerOnPageChangeCallback(object : OnPageChangeCallback(){

            override fun onPageSelected(position: Int) {
                super.onPageSelected(position)
                when (position) {
                    0 -> bottomNavigationView?.menu?.findItem(R.id.selectHome)?.isChecked = true
                    1 -> bottomNavigationView?.menu?.findItem(R.id.selectFavorite)?.isChecked = true

                }
            }
        })

    }







}