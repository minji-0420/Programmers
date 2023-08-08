class Solution {
    fun gcd(a:Int, b:Int) : Int = if(b !=0) gcd(b,a % b) else a
    fun solution(n: Int, m: Int): IntArray {

        var x = gcd(n, m)
        var y = n * m / x

        return intArrayOf(x, y)

    }
}