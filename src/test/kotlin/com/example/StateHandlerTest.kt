package com.example

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

class StateHandlerTest {

    val handler = StateHandler()

    @Test
    fun testHandleStateValidate() {
        val states = arrayOf("ut", "nv", "tx", "al", "ca", "CA")
        val taxs = floatArrayOf(6.85f, 8.00f, 6.25f, 4.00f, 8.25f, 8.25f)
        for (i in states.indices) {
            assertThat(handler.handle(states[i])).isEqualTo(taxs[i])
        }
    }

    @Test
    fun testHandleStateInvalidate() {
        val error = "error"

        assertThat(handler.handle(error)).isEqualTo(0f)
    }
}