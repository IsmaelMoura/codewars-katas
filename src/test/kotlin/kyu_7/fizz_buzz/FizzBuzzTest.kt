package kyu_7.fizz_buzz

import kyu_7.fizz_buzz.FizzBuzz.fizzBuzz
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class FizzBuzzTest {
    @Test
    fun `One Number`() {
        val expected = arrayOf("1")
        assertArrayEquals(expected, fizzBuzz(1))
    }

    @Test
    fun `Ten Numbers`() {
        val expected = arrayOf("1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz")
        assertArrayEquals(expected, fizzBuzz(10))
    }
}