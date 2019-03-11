package org.greeting

import kotlin.test.Test
import kotlin.test.assertEquals

open class SharedHelloWorldTest {

    @Test
    fun testSharedGreeting() {
        assertEquals(SharedSpeaker().sharedGreeting(), "Hello, Android and iOS worlds!")
    }
}
