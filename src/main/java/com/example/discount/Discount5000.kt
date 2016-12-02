package com.example.discount

class Discount5000(var total: Float = 0f) : Discount {

    override fun getSuccessor(): Discount? {
        return Discount1000(total)
    }

    override fun support(): Boolean = total >= 5000f && total < 7000f

    override fun discount(): Float {
        return when {
            support() -> (total * 0.05).toFloat()
            else -> getSuccessor()!!.discount()
        }
    }

}