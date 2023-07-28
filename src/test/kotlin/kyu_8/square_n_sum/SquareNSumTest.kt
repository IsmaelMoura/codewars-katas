package kyu_8.square_n_sum

import kyu_8.square_n_sum.SquareNSum.squareSum
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SquareNSumTest {
    @Test
    fun `Sum of Squared Inputs`() {
        assertEquals(5, squareSum(arrayOf(1, 2)))
        assertEquals(50, squareSum(arrayOf(0, 3, 4, 5)))
        assertEquals(0, squareSum(arrayOf()))
    }
}