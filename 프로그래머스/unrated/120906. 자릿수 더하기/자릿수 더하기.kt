class Solution {
    fun solution(n: Int) = n.toString().toList().sumOf { it.digitToInt() }
}