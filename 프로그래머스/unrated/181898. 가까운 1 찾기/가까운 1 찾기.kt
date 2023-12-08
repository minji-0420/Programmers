class Solution {
    fun solution(arr: IntArray, idx: Int): Int {
        var answer = -1 

        for (i in arr.indices) {
            if (i >= idx && arr[i] == 1) {
                answer = i
                break 
            }
        }
        return answer
    }
}