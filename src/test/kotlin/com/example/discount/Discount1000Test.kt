package com.example.discount

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

class Discount1000Test {

    val discount = Discount1000()

    @Test
    fun testInvalidate() {
        discount.total = 900f

        val support = discount.support()

        assertThat(support).isFalse()
    }
}

