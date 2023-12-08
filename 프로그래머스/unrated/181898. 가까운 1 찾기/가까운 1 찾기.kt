class Solution {
    fun solution(arr: IntArray, idx: Int): Int {
        for (i in arr.indices) {
            if (i >= idx && arr[i] == 1) return i
        }
        return -1
    }
}