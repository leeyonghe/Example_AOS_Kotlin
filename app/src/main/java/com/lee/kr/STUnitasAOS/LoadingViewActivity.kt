package com.lee.kr.STUnitasAOS


import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity

class LoadingViewActivity  : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.loadingview_layout)
        Handler().postDelayed(Runnable {
            startActivity(Intent(this, TableListController::class.java))
            finish()
        }, 3000)
    }

}