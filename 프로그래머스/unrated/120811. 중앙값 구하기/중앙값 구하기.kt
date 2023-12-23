class Solution {
    fun solution(array: IntArray): Int {
        var answer: Int = 0
        val sortedArray = array.sorted()
        if (sortedArray.size % 2 != 0) {
            answer = sortedArray[sortedArray.size / 2]
        }
        return answer
    }
}