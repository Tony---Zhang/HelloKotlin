package com.example.discount

import org.assertj.core.api.Assertions
import org.junit.Test

class Discount5000Test {

    val discount = Discount5000()

    @Test
    fun testInvalidate() {
        discount.total = 4999f

        val support = discount.support()

        Assertions.assertThat(support).isFalse()
    }

    @Test
    fun testValidate() {
        discount.total = 5001f

        val support = discount.support()

        Assertions.assertThat(support).isTrue()
    }

    @Test
    fun testDiscount() {
        discount.total = 5050f

        val save = discount.discount()

        Assertions.assertThat(save.compareTo(252.5f)).isEqualTo(0)
    }
}

