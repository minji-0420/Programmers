class Solution {
    fun solution(start: Int, end_num: Int): IntArray {
        var answer: IntArray = intArrayOf()
        for (i in end_num..start step 1) {
            answer += i
        }
        return answer.sortedDescending().toIntArray()
    }
}