package com.example.discount

import org.assertj.core.api.Assertions
import org.junit.Test

class Discount7000Test {

    val discount = Discount7000()

    @Test
    fun testInvalidate() {
        discount.total = 6999f

        val support = discount.support()

        Assertions.assertThat(support).isFalse()
    }

    @Test
    fun testValidate() {
        discount.total = 7001f

        val support = discount.support()

        Assertions.assertThat(support).isTrue()
    }

    @Test
    fun testDiscountWhenValid() {
        discount.total = 7050f

        val save = discount.discount()

        Assertions.assertThat(save.compareTo(493.5f)).isEqualTo(0)
    }

    @Test
    fun testDiscountWhenInvalid() {
        discount.total = 6900f

        val save = discount.discount()

        Assertions.assertThat(save.compareTo(345f)).isEqualTo(0)
    }
}

