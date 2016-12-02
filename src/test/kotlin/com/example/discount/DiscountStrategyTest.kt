package com.example.discount

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test


class DiscountStrategyTest {

    @Test
    fun testDiscountWhenNone() {
        val total = 18.8f

        val discount = DiscountStrategy.calculateDiscount(DiscountNone(total))

        assertThat(discount.compareTo(0f)).isEqualTo(0)
    }

    @Test
    fun testDiscountWhenMoreThan1000LessThan5000() {
        val total = 4900f

        val discount = DiscountStrategy.calculateDiscount(Discount1000(total))

        assertThat(discount.compareTo(147f)).isEqualTo(0)
    }

    @Test
    fun testDiscountWhenMoreThan5000LessThan7000() {
        val total = 6900f

        val discount = DiscountStrategy.calculateDiscount(Discount5000(total))

        assertThat(discount.compareTo(345f)).isEqualTo(0)
    }

    @Test
    fun testDiscountWhenMoreThan7000LessThan10000() {
        val total = 9900f

        val discount = DiscountStrategy.calculateDiscount(Discount10000(total))

        assertThat(discount.compareTo(693f)).isEqualTo(0)
    }

    @Test
    fun testDiscountWhenMoreThan10000LessThan50000() {
        val total = 49900f

        val save = DiscountStrategy.calculateDiscount(Discount50000(total))

        assertThat(save.compareTo(4990f)).isEqualTo(0)
    }

    @Test
    fun testDiscountWhenMoreThan50000LessThan50000() {
        val total = 60000f

        val save = DiscountStrategy.calculateDiscount(Discount50000(total))

        assertThat(save.compareTo(9000f)).isEqualTo(0)
    }
}