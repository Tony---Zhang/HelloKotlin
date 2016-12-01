package com.example

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
        val total = cart.calculate().toString().format(2)


        println("Shoppping Result: ")
        println("item: $item")
        println("count: $count")
        println("total: $total")
    }
}
