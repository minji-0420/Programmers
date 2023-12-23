class Solution {
    fun solution(numer1: Int, denom1: Int, numer2: Int, denom2: Int): IntArray {
        
        val resultNumer = numer1 * denom2 + numer2 * denom1
        val resultDenom = denom1 * denom2
        
        fun gcd(a: Int, b: Int): Int {
            return if (b == 0) a else gcd(b, a % b)
        }
        
        val gcdValue = gcd(resultNumer, resultDenom)
        
        val simplifiedNumer = resultNumer / gcdValue
        val simplifiedDenom = resultDenom / gcdValue
        
        return intArrayOf(simplifiedNumer, simplifiedDenom)
    }
}