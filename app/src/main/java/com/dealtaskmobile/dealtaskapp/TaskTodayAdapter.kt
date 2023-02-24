package com.dealtaskmobile.dealtaskapp

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.dealtaskmobile.data.models.Task
import com.dealtaskmobile.data.models.TaskToday
import com.dealtaskmobile.signin.R
import com.dealtaskmobile.signin.databinding.ItemTaskTodayBinding

class TaskTodayAdapter: RecyclerView.Adapter<TaskTodayAdapter.TaskTodayHolder>() {

    val taskTodayList = ArrayList<Task>()

    class TaskTodayHolder(item: View): RecyclerView.ViewHolder(item){
        val binding = ItemTaskTodayBinding.bind(item)

        fun bind(task: Task) = with(binding){
            titleTask.text = task.title
            endDateTask.text = "End: ${task.endDate}"
            taskIsDoneCheckBox.isChecked = task.taskIsDone
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TaskTodayHolder{
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_task_today,parent,false)
        return TaskTodayHolder(view)
    }

    override fun onBindViewHolder(holder: TaskTodayHolder, position: Int) {
        holder.bind(taskTodayList[position])
    }

    override fun getItemCount(): Int {
        return taskTodayList.size
    }

    @SuppressLint("NotifyDataSetChanged")
    fun addTaskToday(taskToday: Task){
        taskTodayList.add(taskToday)
        notifyDataSetChanged()
    }

    @SuppressLint("NotifyDataSetChanged")
    fun clearAllData(){
        taskTodayList.clear()
        notifyDataSetChanged()
    }

}