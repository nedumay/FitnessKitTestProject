package com.example.fitnesskit.utils

import java.lang.RuntimeException
import java.text.SimpleDateFormat
import java.util.*

private const val RESPONSE_FORMAT = "yyyy-MM-dd"
private const val RESPONSE_FORMAT_DISPLAY = "EEEE, dd MMMM"

fun getFormattedDate(date:String?):String{

    val utcFormat = SimpleDateFormat(RESPONSE_FORMAT, Locale.ROOT)
    val displayFormat = SimpleDateFormat(RESPONSE_FORMAT_DISPLAY, Locale.getDefault())
    var formateDate: Date? = null
    try {
        if(date != null){
            formateDate = utcFormat.parse(date)
        } else {
            formateDate.toString()
        }
        return displayFormat.format(formateDate)
    } catch (e:Exception){
        throw RuntimeException(e)
    }
}

