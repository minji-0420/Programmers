class Solution {
    fun solution(arr: IntArray): IntArray {
        var answer: IntArray = intArrayOf()
        var result = intArrayOf()
        for (i in arr.indices) {
            if(arr[i] == 2) {
                result += i
            }
        }
        if (result.isNotEmpty()) {
            answer += arr.sliceArray(result[0]..result[result.size-1])
        } else answer += -1

        return answer
    }
}