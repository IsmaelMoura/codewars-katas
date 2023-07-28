package kyu_7.get_the_middle_character

import kyu_7.get_the_middle_character.MiddleCharacter.getMiddle
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

/**
 * Kata link: https://www.codewars.com/kata/56747fd5cb988479af000028/solutions/kotlin
 */
class MiddleCharacterTest {
    @Test
    fun basicTest() {
        assertEquals("es", getMiddle("test"))
        assertEquals("dd", getMiddle("middle"))
        assertEquals("t", getMiddle("testing"))
        assertEquals("A", getMiddle("A"))
    }
}