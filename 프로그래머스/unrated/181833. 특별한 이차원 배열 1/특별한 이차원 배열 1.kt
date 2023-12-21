class Solution {
    fun solution(n: Int): Array<IntArray> {
        var answer = Array(n) { IntArray(n) }
        for (i in answer.indices) {
            for (j in answer.indices) {
                if (i == j) {
                    answer[i][j] = 1
                } else {
                    answer[i][j] = 0
                }
            }
        }
        return answer
    }
}