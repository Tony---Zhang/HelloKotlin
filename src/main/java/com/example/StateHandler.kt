package com.example

import java.util.*

class StateHandler() {

    val stateMap: Map<String, Float>

    init {
        stateMap = HashMap<String, Float>()
        stateMap.put("ut", 6.85f)
        stateMap.put("nv", 8.00f)
        stateMap.put("tx", 6.25f)
        stateMap.put("al", 4.00f)
        stateMap.put("ca", 8.25f)
    }

    fun handle(state: String): kotlin.Float {
        return stateMap[state.toLowerCase(Locale.US)] ?: 0f
    }
}