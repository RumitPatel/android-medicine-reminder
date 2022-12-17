package com.rumitpatel.medicinereminderdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.rumitpatel.medicinereminder.MyUtils

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        MyUtils.showTestToast(this, "my message")
    }
}