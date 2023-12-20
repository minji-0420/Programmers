import kotlin.math.abs
class Solution {
    fun solution(a: Int, b: Int): Int {
        var answer: Int = 0
        answer = if (a % 2 == 1 && b % 2 == 1) {
            a*a + b*b
        } else if (a % 2 == 0 && b % 2 == 0) {
            abs(a-b)
        } else {
            2 * (a + b)
        }
        return answer
    }
}