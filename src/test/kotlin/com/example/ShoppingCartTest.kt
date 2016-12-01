package com.example

import com.example.model.Item
import org.assertj.core.api.Assertions.assertThat
import org.junit.Test


class ShoppingCartTest {

    val cart = ShoppingCart()

    @Test
    fun testAddGood() {
        val item = Item(price = 10.5f, tax = 6.5f)
        val count = 10
        cart.add(item, count)

        assertThat(cart.shoppingList.size).isEqualTo(1)
        assertThat(cart.shoppingList.get(0).first).isEqualTo(item)
        assertThat(cart.shoppingList.get(0).second).isEqualTo(count)
    }
}

