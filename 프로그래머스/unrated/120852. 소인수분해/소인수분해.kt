class Solution {
    fun solution(n: Int): IntArray {
        var num = n
        var divisor = 2
        val result = mutableListOf<Int>()
        while (divisor * divisor <= num) {
            if (num % divisor == 0) {
                result.add(divisor)
                num /= divisor
            } else {
                divisor ++
            }
        }
        if (num > 1) {
            result.add(num)
        }
        return result.toSet().toIntArray()
    }
}