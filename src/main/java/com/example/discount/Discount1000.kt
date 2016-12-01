package com.example.discount

class Discount1000(var total: Float = 0f) {

    fun support(): Boolean {
        return total > 1000f
    }

}