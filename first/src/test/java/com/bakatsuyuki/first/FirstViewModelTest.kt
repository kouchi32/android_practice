package com.bakatsuyuki.first

import com.bakatsuyuki.repository.CountRepository
import io.mockk.MockKAnnotations
import io.mockk.every
import io.mockk.impl.annotations.MockK
import org.junit.Assert
import org.junit.Before
import org.junit.Test

class FirstViewModelTest {
    private lateinit var viewModel: FirstViewModel
    @MockK
    private lateinit var repository: CountRepository

    @Before
    fun setUp() {
        MockKAnnotations.init(this)
        viewModel = FirstViewModel().apply {
            repository = this@FirstViewModelTest.repository
        }
    }

    @Test
    fun constValue() {
        Assert.assertEquals(FirstViewModel.key, "count1")
    }

    @Test
    fun getCount() {
        val count = 100
        every { repository.getCount(FirstViewModel.key) } returns count
        Assert.assertEquals(viewModel.getCount(), 100)
    }
}
