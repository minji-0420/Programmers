class Solution {
    fun solution(my_string: String) = Regex("[0-9]").findAll(my_string).sumOf { it.value.toInt() }
}