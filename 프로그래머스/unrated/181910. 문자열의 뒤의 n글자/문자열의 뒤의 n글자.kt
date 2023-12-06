class Solution {
    fun solution(my_string: String, n: Int): String {
        return my_string.reversed().substring(0 until n).reversed()
    }
}