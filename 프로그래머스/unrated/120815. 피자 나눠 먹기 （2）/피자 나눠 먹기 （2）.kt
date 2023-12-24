class Solution {
    fun solution(n: Int): Int {
        val lcm = lcm(6, n)
        return lcm / 6
    }

    private fun lcm(a: Int, b: Int): Int {
        return (a * b) / gcd(a, b)
    }

    private fun gcd(a: Int, b: Int): Int {
        var num1 = a
        var num2 = b
        while (num2 != 0) {
            val temp = num2
            num2 = num1 % num2
            num1 = temp
        }
        return num1
    }
}