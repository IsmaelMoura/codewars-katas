package kyu_8.find_the_smallest_integer_in_the_array

import kyu_8.find_the_smallest_integer_in_the_array.SmallestIntegerFinder.findSmallestInt
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import java.util.NoSuchElementException

class SmallestIntegerFinderTest {
    @Test
    fun exampleTests() {
        assertEquals(10, findSmallestInt(listOf(15, 20, 10, 17, 22, 9001)))
        assertThrows<NoSuchElementException> { findSmallestInt(emptyList()) }
    }
}