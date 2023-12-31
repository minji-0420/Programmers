import kotlin.math.abs
class Solution {
    fun solution(array: IntArray, n: Int): Int {
        var answer = 0
        var minCount = 0
        for (num in array.sorted()) {
            val currentMin = abs(n - num)
            if (minCount == 0 || currentMin < abs(n - answer)) {
                answer = num
                minCount = 1
            } else if (currentMin == abs(n - answer)) {
                minCount ++
            }
        }
        return answer
    }
}