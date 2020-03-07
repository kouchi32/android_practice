package com.bakatsuyuki.repository

import android.content.Context
import android.content.SharedPreferences

object CountSharedPreferencesHolder {
    private lateinit var sharedPreferences: SharedPreferences
    fun get() = sharedPreferences
    fun setUp(context: Context) {
        sharedPreferences = context.getSharedPreferences("Count", Context.MODE_PRIVATE)
    }
}