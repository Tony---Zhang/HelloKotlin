package com.example.discount

class Discount7000(var total: Float = 0f) : Discount {

    override fun getSuccessor(): Discount? {
        return Discount5000(total)
    }

    override fun support(): Boolean = total >= 7000f && total < 10000f

    override fun discount(): Float {
        return when {
            support() -> (total * 0.07).toFloat()
            else -> getSuccessor()!!.discount()
        }
    }

}