import kotlin.math.abs
class Solution {
    fun solution(a: Int, b: Int): Long {
        val abs = Math.abs(a - b) + 1
        val start = if (a <= b) a.toLong() else b.toLong()
        val numbers = Array(abs) { (start + it).toLong() }
        return numbers.sum()
    }
}