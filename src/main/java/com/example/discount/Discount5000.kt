package com.example.discount

class Discount5000(var total: Float = 0f) {

    fun support(): Boolean {
        return total > 5000f
    }

    fun discount(): Float {
        return when {
            support() -> (total * 0.05).toFloat()
            else -> 0f
        }
    }

}