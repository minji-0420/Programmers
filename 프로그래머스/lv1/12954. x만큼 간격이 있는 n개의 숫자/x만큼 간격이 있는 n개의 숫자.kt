class Solution {
    fun solution(x: Int, n: Int): LongArray {
        // longArrayOf(x, 2x, 3x ... nx)

        return LongArray(n) { (it + 1) * x.toLong() }
    }
}