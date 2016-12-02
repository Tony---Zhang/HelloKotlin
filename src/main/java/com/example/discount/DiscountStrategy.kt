package com.example.discount

object DiscountStrategy {

    fun calculateDiscount(discount: Discount): Float {
        return if (discount.support()) {
            discount.discount()
        } else {
            if (discount.getSuccessor() != null) {
                calculateDiscount(discount.getSuccessor()!!)
            } else {
                0f
            }
        }
    }
}