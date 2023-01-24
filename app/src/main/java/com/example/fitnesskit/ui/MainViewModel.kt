package com.example.fitnesskit.ui

import android.app.Application
import android.util.Log
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.fitnesskit.data.api.ApiFactory
import com.example.fitnesskit.domain.lessons.LessonInfo
import com.example.fitnesskit.domain.trainers.TrainersInfo
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.schedulers.Schedulers

class MainViewModel(application: Application) : AndroidViewModel(application) {

    private val compositeDisposable = CompositeDisposable()

    private val _lessonsInfo = MutableLiveData<List<LessonInfo>>()
    val lessonsInfo: LiveData<List<LessonInfo>> = _lessonsInfo

    private val _trainersInfo = MutableLiveData<List<TrainersInfo>>()
    val trainersInfo: LiveData<List<TrainersInfo>> = _trainersInfo


    init {
        loadDataLessons()
        loadDataTrainers()
    }

    private fun loadDataTrainers() {
        val disposableTrainers = ApiFactory.apiService.getTrainers()
            .map { it.trainersList }
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe({
                _trainersInfo.value = it
            },{
                Log.d("TEST", "Failure: ${it.message}")
            })
        compositeDisposable.add(disposableTrainers)
    }

    private fun loadDataLessons() {
        val disposableLessons = ApiFactory.apiService.getLessons()
            .map { it.lessonsList}
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe({
                       _lessonsInfo.value = it?.sortedBy { it.date }
            },{
                Log.d("TEST", "Failure: ${it.message}")
            })

        compositeDisposable.add(disposableLessons)
    }

    override fun onCleared() {
        super.onCleared()
        compositeDisposable.clear()
    }
}