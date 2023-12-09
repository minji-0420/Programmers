class Solution {
    fun solution(arr: IntArray, intervals: Array<IntArray>): IntArray {
        var answer: IntArray = intArrayOf()
        for (i in intervals.indices) {
            answer += arr.slice(intervals[i][0]..intervals[i][1])
        }
        return answer
    }
}