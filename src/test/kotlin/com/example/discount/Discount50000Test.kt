package com.example.discount

import org.assertj.core.api.Assertions
import org.junit.Test

class Discount50000Test {

    val discount = Discount50000()

    @Test
    fun testInvalidate() {
        discount.total = 49999f

        val support = discount.support()

        Assertions.assertThat(support).isFalse()
    }

    @Test
    fun testValidate() {
        discount.total = 50000f

        val support = discount.support()

        Assertions.assertThat(support).isTrue()
    }

    @Test
    fun testDiscountWhenValid() {
        discount.total = 50050f

        val save = discount.discount()

        Assertions.assertThat(save.compareTo(7507.5f)).isEqualTo(0)
    }

    @Test
    fun testDiscountWhenInvalid() {
        discount.total = 49900f

        val save = discount.discount()

        Assertions.assertThat(save.compareTo(4990f)).isEqualTo(0)
    }
}

