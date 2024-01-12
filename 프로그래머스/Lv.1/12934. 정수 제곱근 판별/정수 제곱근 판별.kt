import kotlin.math.sqrt
class Solution {
    fun solution(n: Long): Long {
        var root = sqrt(n.toDouble()).toLong()
        return if (n == root * root) {
            (root + 1) * (root + 1)
        } else {
            -1
        }
    }
}