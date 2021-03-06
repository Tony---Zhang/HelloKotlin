package com.example

import java.util.*

class StateHandler() {

    val stateMap: Map<String, Float>

    init {
        stateMap = HashMap()
        stateMap.put("ut", 6.85f)
        stateMap.put("nv", 8.00f)
        stateMap.put("tx", 6.25f)
        stateMap.put("al", 4.00f)
        stateMap.put("ca", 8.25f)
    }

    fun handle(state: String) = stateMap[state.toLowerCase(Locale.US)] ?: 0f
}