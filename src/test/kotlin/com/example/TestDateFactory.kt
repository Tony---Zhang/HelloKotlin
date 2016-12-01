package com.example

import com.example.model.Item

object TestDateFactory {
    fun provideItem(): Item {
        return Item(price = 10.5f, tax = 6.5f)
    }
}