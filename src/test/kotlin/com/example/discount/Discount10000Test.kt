package com.example.discount

import org.assertj.core.api.Assertions
import org.junit.Test

class Discount10000Test {

    val discount = Discount10000()

    @Test
    fun testInvalidate() {
        discount.total = 9999f

        val support = discount.support()

        Assertions.assertThat(support).isFalse()
    }

    @Test
    fun testValidate() {
        discount.total = 10000f

        val support = discount.support()

        Assertions.assertThat(support).isTrue()
    }

    @Test
    fun testDiscountWhenValid() {
        discount.total = 10050f

        val save = discount.discount()

        Assertions.assertThat(save.compareTo(1005f)).isEqualTo(0)
    }

    @Test
    fun testDiscountWhenInvalid() {
        discount.total = 9900f

        val save = discount.discount()

        Assertions.assertThat(save.compareTo(693f)).isEqualTo(0)
    }
}

