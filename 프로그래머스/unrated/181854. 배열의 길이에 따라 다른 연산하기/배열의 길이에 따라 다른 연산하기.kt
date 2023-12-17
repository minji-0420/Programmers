class Solution {
    fun solution(arr: IntArray, n: Int): IntArray {
        var answer: IntArray = arr.copyOf()
        for (i in arr.indices step 2) {
            if (arr.size % 2 == 1) {
                answer[i] = arr[i] + n
            } else {
                answer[i + 1] = arr[i + 1] + n
            }
        }
        return answer
    }
}