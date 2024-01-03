class Solution {
    fun solution(my_string: String) = my_string.split("[A-z]".toRegex()).filter { it.isNotEmpty() }.sumOf { it.toString().toInt() }
}