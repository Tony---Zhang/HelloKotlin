package com.example.discount

class Discount10000(var total: Float = 0f) : Discount {

    override fun getSuccessor(): Discount? {
        return Discount7000(total)
    }

    override fun support(): Boolean = total >= 10000f && total < 50000f

    override fun discount(): Float {
        return when {
            support() -> (total * 0.1).toFloat()
            else -> getSuccessor()!!.discount()
        }
    }
}