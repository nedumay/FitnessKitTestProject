package com.example.fitnesskit.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.RecyclerView
import com.example.fitnesskit.R
import com.example.fitnesskit.ui.adapters.LessonsRecyclerViewAdapter

class MainActivity : AppCompatActivity() {

    private lateinit var viewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewModel = ViewModelProviders.of(this)[MainViewModel::class.java]

        val recyclerViewLessons = findViewById<RecyclerView>(R.id.recyclerViewLessons)
        val adapterRV = LessonsRecyclerViewAdapter()
        recyclerViewLessons.adapter = adapterRV

        viewModel.lessonsInfo.observe(this, Observer {
            adapterRV.lessonInfoList = it
        })
        viewModel.trainersInfo.observe(this, Observer {
            Log.d("TEST", it.toString())
        })

    }
}