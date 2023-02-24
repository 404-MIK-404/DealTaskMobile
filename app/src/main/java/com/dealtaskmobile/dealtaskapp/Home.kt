package com.dealtaskmobile.dealtaskapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.dealtaskmobile.signin.R
import com.dealtaskmobile.signin.databinding.FragmentFavoriteBinding
import com.dealtaskmobile.signin.databinding.FragmentHomeBinding


class Home : Fragment() {

    private var recycleViewTaskToday: RecyclerView? = null

    private var binding: FragmentHomeBinding? = null

    private var taskTodayAdapter: TaskTodayAdapter = TaskTodayAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentHomeBinding.inflate(inflater, container, false)
        init()
        val view = binding?.root
        return view
    }



    fun init(){
        binding?.recycleViewTaskToday?.layoutManager = LinearLayoutManager(context,
            LinearLayoutManager.HORIZONTAL,false)
        taskTodayAdapter.addTaskToday(com.dealtaskmobile.data.models.Task(title = "test", description = "hello", createDate = "24.02.2023", endDate = "25.02.2023", taskIsDone = true))
        binding?.recycleViewTaskToday?.adapter = taskTodayAdapter
    }

    companion object {
        @JvmStatic
        fun newInstance() = Home()
    }
}