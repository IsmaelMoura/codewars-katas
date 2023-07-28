package kyu_8.square_n_sum

/**
 * Kata link: https://www.codewars.com/kata/515e271a311df0350d00000f/train/kotlin
 */
object SquareNSum {
    fun squareSum(n: Array<Int>) = n.sumOf { it * it }
}