class Solution {
    fun solution(arr: IntArray, k: Int): IntArray {
        var answer = IntArray(arr.size)
        for (i in arr.indices) {
            if (k % 2 == 0) {
                answer[i] = k + arr[i]
            } else {
                answer[i] = k * arr[i]
            }
        }
        return answer
    }
}