package com.example.fitnesskit.ui.adapters

import android.view.View
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.example.fitnesskit.R

class LessonViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    val textViewDate = itemView.findViewById<TextView>(R.id.textViewDate)
    val imageViewColor = itemView.findViewById<CardView>(R.id.imageColor)
    val textViewTimeStart = itemView.findViewById<TextView>(R.id.textViewTimeStart)
    val textViewTimeEnd = itemView.findViewById<TextView>(R.id.textViewTimeEnd)
    val textViewNameLesson = itemView.findViewById<TextView>(R.id.textViewNameLesson)
    val textViewNameTrainer = itemView.findViewById<TextView>(R.id.textViewNameTrainer)
    val textViewPlace = itemView.findViewById<TextView>(R.id.textViewPlace)
}