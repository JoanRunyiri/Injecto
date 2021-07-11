package com.example.injecto

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_contact.*

//import org.jetbrains.anko.sendSMS


class ContactActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contact)
        apply.setOnClickListener {
            startActivity(
                Intent(
                    Intent.ACTION_VIEW,
                    Uri.fromParts("Application for Vaccine", "0700000000", null)
                )
            )


//            sendSMS("0111620459","Hello, Is this Available?")
//        }

        }
    }
}
