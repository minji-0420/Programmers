class Solution {
    fun solution(arr: IntArray, queries: Array<IntArray>): IntArray {
        
        for ((index, query) in queries.withIndex()) {

            for (i in query[0]..query[1]) {
                if (i % query[2] == 0) {
                    arr[i] = arr[i] + 1
                } else arr[i] = arr[i]
            }
        }
        return arr
    }
}