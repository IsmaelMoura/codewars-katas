package kyu_7.complementary_DNA

/**
 * Kata link: https://www.codewars.com/kata/554e4a2f232cdd87d9000038/train/kotlin
 */
object Solution {

    fun makeComplement(dna: String): String {
        return dna.split("").joinToString("") {
            when (it.uppercase()) {
                "A" -> "T"
                "T" -> "A"
                "C" -> "G"
                "G" -> "C"
                else -> it
            }
        }
    }
}