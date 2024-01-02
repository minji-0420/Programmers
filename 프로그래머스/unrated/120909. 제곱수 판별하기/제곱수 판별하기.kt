class Solution {
    fun solution(n: Int): Int {
        val sqrt = kotlin.math.sqrt(n.toDouble()).toLong()
        return if ((sqrt * sqrt).toInt() == n) 1 else 2
    }
}