package com.example.android.jci

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.support.v4.content.ContextCompat.startActivity
import android.support.v7.app.AppCompatActivity
import com.example.android.jci.SharedPreferenceHelper.Companion.getBooleanPreference

/**
created on 3/5/2018*/


class SplashActivity : AppCompatActivity() {

 /*private var mDelayHandler: Handler? = null
    private val SPLASH_DELAY: Long = 3000 //3 seconds

    internal val mRunnable: Runnable = Runnable {
        if (!isFinishing) {

            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }
    }*/

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        /*//Initialize the Handler
        mDelayHandler = Handler()

        //Navigate with delay
        mDelayHandler!!.postDelayed(mRunnable, SPLASH_DELAY)*/

        Handler().postDelayed({
            var isDeviceRegister = getBooleanPreference(this,"isDeviceRegister",false)
            if(isDeviceRegister){
                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
                finish()
            }else {
                val intent = Intent(this, DeviceRegister::class.java)
                startActivity(intent)
                finish()
            }
        },2000)

    }

   /* public override fun onDestroy() {

        if (mDelayHandler != null) {
            mDelayHandler!!.removeCallbacks(mRunnable)
        }

        super.onDestroy()
    }*/

}
