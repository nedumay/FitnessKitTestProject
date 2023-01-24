package com.example.fitnesskit.ui.adapters

import android.util.TimeUtils
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.fitnesskit.R
import com.example.fitnesskit.domain.lessons.LessonInfo
import com.example.fitnesskit.utils.getFormattedDate

class LessonsRecyclerViewAdapter : RecyclerView.Adapter<LessonViewHolder>() {

    var lessonInfoList : List<LessonInfo> = mutableListOf()
    set(value){
        field = value
        notifyDataSetChanged()
    }
    init {
        lessonInfoList.sortedWith(
            compareBy(String.CASE_INSENSITIVE_ORDER, { it.date.toString() }
            )
        )
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LessonViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_timetable,parent,false)
        return LessonViewHolder(view)
    }

    override fun onBindViewHolder(holder: LessonViewHolder, position: Int) {
        val lesson = lessonInfoList[position]
        holder.textViewDate.text = getFormattedDate(lesson.date.toString())
        holder.imageViewColor.setBackgroundColor(lesson.color.hashCode())
        holder.textViewTimeStart.text = lesson.startTime
        holder.textViewTimeEnd.text = lesson.endTime
        holder.textViewNameLesson.text = lesson.name
        holder.textViewNameTrainer.text = lesson.coach_id
        holder.textViewPlace.text = lesson.place
    }

    override fun getItemCount() = lessonInfoList.size

}