package kyu_8.reversed_sequence

import java.util.stream.IntStream

/**
 * Kata link: https://www.codewars.com/kata/5a00e05cc374cb34d100000d/train/kotlin
 */
object ReversedSequence {
    fun reverseSeq(n: Int) = n.downTo(1).toList()
}