package com.example

import com.example.model.Item

class ShoppingCart {

    var shoppingList = mutableListOf<Pair<Item, Int>>()

    fun add(item: Item, count: Int) {
        shoppingList.add(Pair(item, count))
    }

    fun calculate(): Float {
        var total = 0f
        shoppingList.forEach {
            val item = it.first
            total += item.price * (1 + item.tax / 100) * it.second
        }
        return total
    }

}