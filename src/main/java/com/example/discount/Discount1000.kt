package com.example.discount

class Discount1000(var total: Float = 0f) : Discount {

    override fun support(): Boolean {
        return total > 1000f
    }

    override fun discount(): Float {
        return when {
            support() -> (total * 0.03).toFloat()
            else -> 0f
        }
    }

}