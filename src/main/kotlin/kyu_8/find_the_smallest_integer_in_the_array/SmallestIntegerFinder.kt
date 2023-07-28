package kyu_8.find_the_smallest_integer_in_the_array

/**
 * Kata link: https://www.codewars.com/kata/55a2d7ebe362935a210000b2/solutions/kotlin
 */
object SmallestIntegerFinder {
    fun findSmallestInt(nums: List<Int>) = nums.minOf { it }
}