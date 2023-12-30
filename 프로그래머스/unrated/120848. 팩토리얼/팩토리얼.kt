class Solution {
    fun solution(n: Int): Int {
        var i = 1
        var factorial = 1

        while (factorial <= n) {
            i++
            factorial *= i
        }

        return i - 1
    }
}