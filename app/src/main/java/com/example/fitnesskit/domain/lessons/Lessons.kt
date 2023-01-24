package com.example.fitnesskit.domain.lessons

import com.example.fitnesskit.domain.trainers.TrainersInfo
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class Lessons(
    @SerializedName("lessons")
    @Expose
    val lessonsList: List<LessonInfo>? = null,
)
