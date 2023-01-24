package com.example.fitnesskit.domain.trainers

import com.example.fitnesskit.domain.lessons.LessonInfo
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class TrainersInfo(
    @SerializedName("id")
    @Expose
    val id: String? = null,
    @SerializedName("full_name")
    @Expose
    val full_name: String? = null
)
