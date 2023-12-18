class Solution {
    fun solution(rank: IntArray, attendance: BooleanArray): Int {
        var answer: Int = 0
        var result = intArrayOf()
        for (i in attendance.indices) {
            if (attendance[i]) {
                result += rank[i]
            }
        }
        var sortedResult = result.sorted()
        answer = rank.indexOf(sortedResult[0]) * 10000 + rank.indexOf(sortedResult[1]) * 100 + rank.indexOf(sortedResult[2])
        return answer
    }
}