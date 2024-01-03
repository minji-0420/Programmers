class Solution {
    fun solution(numbers: IntArray): Int {
        numbers.sort()
        var max = numbers[numbers.size - 1] * numbers[numbers.size - 2]
        var min = numbers[0] * numbers[1]
        return maxOf(max, min)
    }
}