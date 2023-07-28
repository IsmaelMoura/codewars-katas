package kyu_7.fizz_buzz

/**
 * Kata link: https://www.codewars.com/kata/5300901726d12b80e8000498/train/kotlin
 */
object FizzBuzz {
    fun fizzBuzz(n: Int): Array<String> {
        return (1..n).toList().map {
            when {
                it % 3 == 0 && it % 5 == 0 -> "FizzBuzz"
                it % 3 == 0 -> "Fizz"
                it % 5 == 0 -> "Buzz"
                else -> it.toString()
            }
        }.toTypedArray()
    }
}