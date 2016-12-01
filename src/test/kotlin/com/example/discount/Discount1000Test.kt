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

    @Test
    fun testValidate() {
        discount.total = 1001f

        val support = discount.support()

        assertThat(support).isTrue()
    }

    @Test
    fun testDiscountWhenValid() {
        discount.total = 1050f

        val save = discount.discount()

        assertThat(save.compareTo(31.5f)).isEqualTo(0)
    }

    @Test
    fun testDiscountWhenInvalid() {
        discount.total = 900f

        val save = discount.discount()

        assertThat(save.compareTo(0f)).isEqualTo(0)
    }
}

