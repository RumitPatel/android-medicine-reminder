package com.rumitpatel.medicinereminder

import android.content.Context
import android.widget.Toast

object MyUtils {
    fun showMyToast(context: Context, message: String?) {
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show()
    }
}

fun showMyToast2(context: Context, message: String?) {
    Toast.makeText(context, message, Toast.LENGTH_SHORT).show()
}