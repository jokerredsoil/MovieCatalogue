package com.septian.moviecatalogue.misc

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.septian.moviecatalogue.databinding.ActivitySplashScreenBinding
import com.septian.moviecatalogue.home.HomeActivity

class SplashScreenActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val splashBinding = ActivitySplashScreenBinding.inflate(layoutInflater)
        setContentView(splashBinding.root)

        val background = object : Thread(){
            override fun run() {

                try {
                    sleep(3000)

                    finish()
                    val intent = Intent(baseContext,HomeActivity::class.java)
                    startActivity(intent)

                }catch (e : Exception){
                    e.printStackTrace()
                }
            }
        }
        background.start()
    }
}