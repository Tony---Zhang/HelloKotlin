package com.example.discount

import org.assertj.core.api.Assertions
import org.junit.Test

class DiscountNoneTest {

    val discount = DiscountNone()

    @Test
    fun testValidate() {
        val support = discount.support()

        Assertions.assertThat(support).isTrue()
    }

    @Test
    fun testDiscount() {
        discount.total = 100f

        val save = discount.discount()

        Assertions.assertThat(save.compareTo(0f)).isEqualTo(0)
    }
}