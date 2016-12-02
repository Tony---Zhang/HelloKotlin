package com.example.discount

object DiscountStrategy {

    fun calculateDiscount(discount: Discount): Float = when {
        discount.support() -> discount.discount()
        discount.getSuccessor() != null -> calculateDiscount(discount.getSuccessor()!!)
        else -> 0f
    }
}