package com.bakatsuyuki.repository

import android.content.SharedPreferences

fun SharedPreferences.putInt(key: String, value: Int) {
    edit().putInt(key, value).apply()
}