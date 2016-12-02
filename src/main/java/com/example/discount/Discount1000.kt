package com.example.discount

class Discount1000(var total: Float = 0f) : Discount {

    override fun getSuccessor(): Discount? = DiscountNone(total)

    override fun support(): Boolean = total >= 1000f && total < 5000f

    override fun discount(): Float = (total * 0.03).toFloat()

}