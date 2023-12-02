class Solution {
    fun solution(a: Int, d: Int, included: BooleanArray): Int {
        var answer: Int = 0

        for (j in included.indices) {
            if (included[j]) {
                val i = a + j * d
                answer += i
            }
        }
        return answer
    }
}