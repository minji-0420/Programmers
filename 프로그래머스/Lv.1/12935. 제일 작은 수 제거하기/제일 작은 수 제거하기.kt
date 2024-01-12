class Solution {
    fun solution(arr: IntArray): IntArray {
        var answer = arr.toMutableList()
        answer.remove(arr.minOrNull())
        return if (answer.size > 0) answer.toIntArray() else intArrayOf(-1)
    }
}