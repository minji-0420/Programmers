class Solution {
    fun solution(s: String, n: Int) = s.map {
        when {
            it.isLowerCase() -> ((it - 'a' + n) % 26 + 'a'.toInt()).toChar()
            it.isUpperCase() -> ((it - 'A' + n) % 26 + 'A'.toInt()).toChar()
            else -> it
        }
    }.joinToString("")
}