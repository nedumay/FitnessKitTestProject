package com.example.fitnesskit.domain.lessons

import com.example.fitnesskit.domain.trainers.TrainersInfo
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class LessonInfo(
    @SerializedName("name")
    @Expose
    val name: String? = null,
    @SerializedName("place")
    @Expose
    val place: String? = null,
    @SerializedName("startTime")
    @Expose
    val startTime: String? = null,
    @SerializedName("endTime")
    @Expose
    val endTime: String? = null,
    @SerializedName("coach_id")
    @Expose
    val coach_id: String? = null,
    @SerializedName("date")
    @Expose
    val date: String? = null,
    @SerializedName("color")
    @Expose
    val color: String? = null
)