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

        val item = Item()
        val stateHandler = StateHandler()
        item.price = price
        item.tax = stateHandler.handle(state)

        println(item)
    }
}
