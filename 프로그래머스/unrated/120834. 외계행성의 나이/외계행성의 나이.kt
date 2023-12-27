class Solution {
    fun solution(age: Int) = age.toString().toList().map {
        (it.digitToInt() + 97).toChar()
    }.joinToString("")
}