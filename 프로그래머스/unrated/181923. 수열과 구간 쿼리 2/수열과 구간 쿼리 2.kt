class Solution {
    fun solution(arr: IntArray, queries: Array<IntArray>): IntArray {
        val result = IntArray(queries.size)

        for ((index, query) in queries.withIndex()) {
            var minValue = Int.MAX_VALUE
            var found = false

            for (i in query[0]..query[1]) {
                if (arr[i] > query[2] && arr[i] < minValue) {
                    minValue = arr[i]
                    found = true
                }
            }

            result[index] = if (found) minValue else -1
        }

        return result
    }
}