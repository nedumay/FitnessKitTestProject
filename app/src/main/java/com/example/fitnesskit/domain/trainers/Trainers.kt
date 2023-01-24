package com.example.fitnesskit.domain.trainers

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class Trainers(
    @SerializedName("trainers")
    @Expose
    val trainersList: List<TrainersInfo>? = null
)
