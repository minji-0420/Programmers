class Solution {
    fun solution(a: Int, b: Int): Int {
        var result = b / gcd(a, b)
        while (result != 1) {
            result /= if (result % 2 == 0) {
                2
            } else if (result % 5 == 0) {
                5
            } else {
                return 2
            }
        }
        return 1
    }
    
    private fun gcd(a: Int, b: Int): Int {
        return if (b == 0) {
            a
        } else {
            gcd(b, a % b)
        }
    }
}