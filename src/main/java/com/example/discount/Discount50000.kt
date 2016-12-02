package com.example.discount

class Discount50000(var total: Float = 0f) : Discount {

    override fun getSuccessor(): Discount? {
        return Discount10000(total)
    }

    override fun support(): Boolean = total >= 50000f

    override fun discount(): Float {
        return when {
            support() -> (total * 0.15).toFloat()
            else -> getSuccessor()!!.discount()
        }
    }

}