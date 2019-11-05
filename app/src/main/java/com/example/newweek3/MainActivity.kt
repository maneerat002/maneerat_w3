package com.example.newweek3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    public final var TAG_FNAME = "FNAME"
    public final var TAG_LNAME = "LNAME"
    public final var TAG_NUMBER = "NUMBER"
    public final var TAG_SEX = "SEX"
    public final var TAG_EMAIL = "EMAIL"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setTitle("Nest002")

        btn__send.setOnClickListener {
            var fname = et_fname.text.toString()
            var lname = et_lname.text.toString()
            var number = et_number.text.toString()
            var sex = et_sex.text.toString()
            var email = et_email.text.toString()

            senderFun(fname,lname,number,sex,email)
        }

        btn_clear.setOnClickListener {
            et_fname.setText("")
            et_lname.setText("")
            et_number.setText("")
            et_sex.setText("")
            et_email.setText("")
        }

        btn_close.setOnClickListener {
            finish()
        }

    }

    fun senderFun(str1 : String,str2 : String,str3 : String,str4 :String,str5 :String){
        var goPagesecond = Intent( this,SecondActivity ::class.java)

        goPagesecond.putExtra(TAG_FNAME,str1)
        goPagesecond.putExtra(TAG_LNAME,str2)
        goPagesecond.putExtra(TAG_NUMBER,str3)
        goPagesecond.putExtra(TAG_SEX,str4)
        goPagesecond.putExtra(TAG_EMAIL,str5)
        startActivity(goPagesecond)
    }
}
