package com.example.injecto

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_contact.*
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        myprofile.setOnClickListener {
            val intent = Intent(this, ProfileActivity::class.java)
            //start the signup activity
            startActivity(intent)
        }

        signin.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            //start the signup activity
            startActivity(intent)
        }
        calender.setOnClickListener {
            val intent = Intent(this, ScheduleActivity::class.java)
            //start the signup activity
            startActivity(intent)
        }
        vaccines.setOnClickListener {
            val intent = Intent(this, VaccineActivity::class.java)
            //start the signup activity
            startActivity(intent)
        }
        otherservices.setOnClickListener {
            val intent = Intent(this, ContactActivity::class.java)
            //start the signup activity
            startActivity(intent)
        }
    }
}

