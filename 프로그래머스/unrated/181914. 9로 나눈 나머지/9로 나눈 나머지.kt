class Solution {
    fun solution(number: String): Int {
        val numbers = number.map{ it.toString().toInt() }
        var count = 0
        for (i in numbers.indices) {
            count += numbers[i]
        }
        return count % 9
    }
}