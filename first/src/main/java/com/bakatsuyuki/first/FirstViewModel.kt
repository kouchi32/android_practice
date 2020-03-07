package com.bakatsuyuki.first

import androidx.lifecycle.ViewModel
import com.bakatsuyuki.repository.CountRepository

class FirstViewModel : ViewModel() {
    lateinit var repository: CountRepository

    fun getCount(): Int = repository.getCount(key)

    fun increment() {
        val count = repository.getCount(key)
        repository.setCount(key, count + 1)
    }

    fun reset() {
        repository.setCount(key, 0)
    }

    companion object {
        const val key = "count1"
    }
}