class Solution {
    fun solution(word: String): Int {
        val array = mapOf("A" to 0, "E" to 1, "I" to 2, "O" to 3, "U" to 4)
        val count = listOf(781, 156,31, 6,1)

        return word.mapIndexed { index, char -> count[index] * (array[char.toString()] ?: error("")) }.sum() + word.length
    }
}