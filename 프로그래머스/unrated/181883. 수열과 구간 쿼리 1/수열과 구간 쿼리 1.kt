class Solution {
    fun solution(arr: IntArray, queries: Array<IntArray>): IntArray {
        for (i in queries.indices) {
            for (j in queries[i][0]..queries[i][1]) {
                arr[j] ++
            }
        }
        return arr
    }
}