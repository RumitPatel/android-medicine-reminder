package com.rumitpatel.medicinereminder

import android.content.Context
import android.widget.Toast

object MyUtils {
    fun showTestToast(context: Context, message: String) {
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show()
    }
}