package com.example

import com.example.model.Item

class ShoppingCart {

    var shoppingList = mutableListOf<Pair<Item, Int>>()

    fun add(item: Item, count: Int) {
        shoppingList.add(Pair(item, count))
    }

    fun calculate(): Float {
        return 0f
    }

}