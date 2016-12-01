package com.example

import com.example.discount.Discount
import com.example.discount.Discount1000
import com.example.discount.Discount5000
import com.example.model.Item
import java.util.*

object Main {

    @JvmStatic
    fun main(args: Array<String>) {
        val sc = Scanner(System.`in`)
        println("Please input price: ")
        val price = sc.nextFloat()
        println("Please input state: ")
        val state = sc.next()
        println("Please input count: ")
        val count = sc.nextInt()

        val item = Item()
        item.price = price
        item.tax = StateHandler().handle(state)
        val cart = ShoppingCart()
        cart.add(item, count)
        val calculate = cart.calculate()
        var discount = 0f
        val discounts = listOf<Discount>(Discount1000(calculate), Discount5000(calculate))
        discounts.forEach {
            if (it.support()) {
                discount = it.discount()
            }
        }

        println("Shoppping Result: ")
        println("item: $item")
        println("count: $count")
        println("discount: ${"%.2f".format(discount)}")
        println("total: ${"%.2f".format(calculate - discount)}")
    }
}
