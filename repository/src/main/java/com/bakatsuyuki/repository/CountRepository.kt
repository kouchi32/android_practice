package com.bakatsuyuki.repository

import android.content.SharedPreferences

class CountRepository(private val sharedPreferences: SharedPreferences) {
    fun getCount(key: String): Int = sharedPreferences.getInt(key, 0)

    fun increment(key: String) {
        val count = getCount(key)
        sharedPreferences.putInt(key, count + 1)
    }

    fun reset(key: String) {
        sharedPreferences.putInt(key, 0)
    }
}