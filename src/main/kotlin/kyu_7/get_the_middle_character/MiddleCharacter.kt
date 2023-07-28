package kyu_7.get_the_middle_character

object MiddleCharacter {
    fun getMiddle(word: String): String {
        word.length.apply {
            return word.substring(
                startIndex = this / 2 - (this + 1) % 2,
                endIndex = this / 2 + 1
            )
        }
    }
}