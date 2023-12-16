class Solution {
    fun solution(arr: IntArray, k: Int): IntArray {
        var result = arr.toSet().toIntArray()
        var answer = result.copyOf(k)
        if (k > result.size) {
            for (i in result.size until k) {
                answer[i] = -1
            }
        }
        return answer
    }
}