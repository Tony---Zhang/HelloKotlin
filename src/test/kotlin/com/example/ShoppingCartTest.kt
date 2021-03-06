package com.example

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test


class ShoppingCartTest {

    val cart = ShoppingCart()

    @Test
    fun testAddGood() {
        val item = TestDateFactory.provideItem()
        val count = 10
        cart.add(item, count)

        assertThat(cart.shoppingList.size).isEqualTo(1)
        assertThat(cart.shoppingList[0].first).isEqualTo(item)
        assertThat(cart.shoppingList[0].second).isEqualTo(count)
    }

    @Test
    fun testCalculateEmpty() {
        assertThat(cart.shoppingList.isEmpty()).isTrue()
        assertThat(cart.calculate()).isEqualTo(0f)
    }

    @Test
    fun testCalculateOneItem() {
        val item = TestDateFactory.provideItem()
        val count = 10
        cart.add(item, count)

        val total = cart.calculate()

        assertThat(total.compareTo(111.825f))
    }
}

