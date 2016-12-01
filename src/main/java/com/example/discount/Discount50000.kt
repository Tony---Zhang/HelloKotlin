package com.example.discount

class Discount50000(var total: Float = 0f) : Discount {
    override fun support(): Boolean {
        return total >= 50000f
    }

    override fun discount(): Float {
        return when {
            support() -> (total * 0.15).toFloat()
            else -> getSuccessor()!!.discount()
        }
    }

    override fun getSuccessor(): Discount? {
        return Discount10000(total)
    }

}