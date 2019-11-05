package com.example.newweek3

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity :AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        setTitle("Maneerat002")
        var fname = intent.extras?.getString(MainActivity().TAG_FNAME)
        var lname = intent.extras?.getString(MainActivity().TAG_LNAME)
        var number = intent.extras?.getString(MainActivity().TAG_NUMBER)
        var sex = intent.extras?.getString(MainActivity().TAG_SEX)
        var email = intent.extras?.getString(MainActivity().TAG_EMAIL)

        tv_fname.setText(fname)
        tv_lname.setText(lname)
        tv_number.setText(number)
        tv_sex.setText(sex)
        tv_email.setText(email)

        btn_back.setOnClickListener {
            finish()
        }
    }

}