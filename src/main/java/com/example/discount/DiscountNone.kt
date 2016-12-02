package com.example.discount

class DiscountNone(var total: Float = 0f) : Discount {

    override fun getSuccessor(): Discount? = null

    override fun support(): Boolean = true

    override fun discount(): Float = 0f

}