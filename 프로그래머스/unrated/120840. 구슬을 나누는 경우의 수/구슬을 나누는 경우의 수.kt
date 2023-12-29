class Solution {
    fun solution(balls: Int, share: Int): Long {
        return factorial(balls, share)
    }
    private fun factorial(n: Int, r: Int) : Long {
        return if (n == r || r == 0) 1 else factorial(n - 1, r - 1) + factorial(n-1, r)
    }
}