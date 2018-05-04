package com.example.android.jci
import android.content.SharedPreferences
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.content.Context.MODE_PRIVATE



class MainActivity : AppCompatActivity() {



    /*private lateinit var FirstMessage:TextView*/

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

 /*       FirstMessage = this.findViewById<TextView>(R.id.FirstMessage)
        checkAppRun()*/

    }
  /*  *//**for checking app run info wheather first tme or not*//*

    fun checkAppRun()
    {
        val sharedPreferences = baseContext.getSharedPreferences(
                "MyAppPreference", MODE_PRIVATE
        )
        val IsFirstRun = sharedPreferences.getBoolean("IsFirstRun", true)
        if (IsFirstRun) {
            FirstMessage.text = "App running first time"
            val editor = sharedPreferences.edit()
            editor.putBoolean("IsFirstRun", false)
            editor.commit()
        } else {
            FirstMessage.text = "App not running for first time"
        }

    }*/
}