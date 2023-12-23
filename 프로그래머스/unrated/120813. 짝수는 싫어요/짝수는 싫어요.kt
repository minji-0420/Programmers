class Solution {
    fun solution(n: Int): IntArray {
        var answer: IntArray = intArrayOf()
        for (num in 0..n) {
            if (num % 2 == 1) {
                answer += num
            }
        }
        return answer
    }
}