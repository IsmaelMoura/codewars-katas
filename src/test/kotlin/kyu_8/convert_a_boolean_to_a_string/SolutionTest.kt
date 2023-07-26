package kyu_8.convert_a_boolean_to_a_string

import kyu_8.convert_a_boolean_to_a_string.BoolToStr.convert
import org.junit.Assert.assertEquals
import org.junit.Test

class BoolToStrTest {
    @Test
    fun testTrue() {
        assertEquals("true", convert(true))
    }

    @Test
    fun testFalse() {
        assertEquals("false", convert(false))
    }
}