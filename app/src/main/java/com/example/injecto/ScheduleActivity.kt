package com.example.injecto

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import java.util.*


class ScheduleActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_schedule)
        title = "Injecto"
    }

    fun addCalendarEvent(view: View) {
        val calendarEvent: Calendar = Calendar.getInstance()
        val intent = Intent(Intent.ACTION_EDIT)
        intent.type = "vnd.android.cursor.item/event"
        intent.putExtra("beginTime", calendarEvent.timeInMillis)
        intent.putExtra("allDay", true)
        class ScheduleActivity : AppCompatActivity() {
            override fun onCreate(savedInstanceState: Bundle?) {
                super.onCreate(savedInstanceState)
                setContentView(R.layout.activity_schedule)
                title = "Injecto"
            }


            fun addCalendarEvent(view: View) {
                val calendarEvent: Calendar = Calendar.getInstance()
                val intent = Intent(Intent.ACTION_EDIT)
                intent.type = "vnd.android.cursor.item/event"
                intent.putExtra("beginTime", calendarEvent.timeInMillis)
                intent.putExtra("allDay", true)
                intent.putExtra("rule", "FREQ=YEARLY")
                intent.putExtra("endTime", calendarEvent.timeInMillis + 60 * 60 * 1000)
                intent.putExtra("title", "Calendar Event")
                startActivity(intent)
            }
        }
    }
}
