class Solution {
    fun solution(n: Int, k: Int): Int {
        val kNum = n.toString(k).split("0")
        return kNum.count {it.isNotEmpty() && isPrime(it.toLong())}
    }
    fun isPrime(n: Long): Boolean {
        if (n < 2) return false
        for (i in 2..Math.sqrt(n.toDouble()).toLong()) {
            if (n % i == 0L) return false
        }
        return true
    }
}