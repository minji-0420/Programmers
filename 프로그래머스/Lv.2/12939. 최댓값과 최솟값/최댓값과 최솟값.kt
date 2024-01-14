class Solution {
    fun solution(s: String): String {
        val result = s.split(" ").map { it.toInt() }
        val min = result.minOrNull()
        val max = result.maxOrNull()
        return "$min $max"
    }
}