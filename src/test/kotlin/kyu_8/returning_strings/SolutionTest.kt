package kyu_8.returning_strings

import kyu_8.returning_strings.Solution.greet
import org.junit.Test
import org.junit.jupiter.api.Assertions.*

class SolutionTest {
    @Test
    fun `Basic tests`() {
        assertEquals(greet("Ryan"), "Hello, Ryan how are you doing today?")
        assertEquals(greet("Shingles"), "Hello, Shingles how are you doing today?")
    }
}