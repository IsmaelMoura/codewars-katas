package kyu_8.reversed_sequence

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class ReversedSequenceTest {
    @Test
    fun exampleTestCases() {
        assertEquals(listOf(5, 4, 3, 2, 1), ReversedSequence.reverseSeq(5))
    }
}