package com.rumitpatel.medicinereminderdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.rumitpatel.medicinereminder.MyUtils

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun testFunction(v:View) {
        MyUtils.showTestToast(this, "my message")
    }
}