class Solution {
    fun solution(n: Int): Int {
        // 피보나치의 수
        // 0 1 1 2 3 5 8 13
        var f = Array(n + 1) {0}

        f[0] = 0
        f[1] = 1

        for ( i in 2 until f.size) {
            f[i] = ( (f[i-2] % 1234567) + (f[i-1] % 1234567) ) % 1234567
        }
        return f[n]
    }
}