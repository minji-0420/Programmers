class Solution {
    fun solution(answers: IntArray): IntArray {
        var answer = intArrayOf(0, 0, 0)
        var score = intArrayOf()
        var n1 = intArrayOf(1,2,3,4,5)
        var n2 = intArrayOf(2,1,2,3,2,4,2,5)
        var n3 = intArrayOf(3,3,1,1,2,2,4,4,5,5)
        for (i in answers.indices) {
            if (n1[i % n1.size] == answers[i]) answer[0] ++
            if (n2[i % n2.size] == answers[i]) answer[1] ++
            if (n3[i % n3.size] == answers[i]) answer[2] ++
        }
        if (answer[0] >= answer[1] && answer[0] >= answer[2]) score += 1
        if (answer[1] >= answer[0] && answer[1] >= answer[2]) score += 2
        if (answer[2] >= answer[0] && answer[2] >= answer[1]) score += 3
        return score.sortedArray()

    }
}