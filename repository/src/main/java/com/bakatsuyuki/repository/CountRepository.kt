package com.bakatsuyuki.repository

import android.content.SharedPreferences

object CountRepository {
    private val sharedPreferences: SharedPreferences by lazy { CountSharedPreferencesHolder.get() }
    fun getCount(key: String): Int = sharedPreferences.getInt(key, 0)

    fun setCount(key: String, count: Int) {
        sharedPreferences.putInt(key, count)
    }
}