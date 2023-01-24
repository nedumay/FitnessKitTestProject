package com.example.fitnesskit.data.api

import com.example.fitnesskit.domain.lessons.Lessons
import com.example.fitnesskit.domain.trainers.Trainers
import io.reactivex.Single
import retrofit2.http.GET

interface ApiService {

    @GET("schedule/get_v3/?club_id=2")
    fun getLessons() : Single<Lessons>

    @GET("schedule/get_v3/?club_id=2")
    fun getTrainers() : Single<Trainers>
}