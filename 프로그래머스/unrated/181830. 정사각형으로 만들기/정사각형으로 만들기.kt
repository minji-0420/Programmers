import kotlin.math.max
class Solution {
    fun solution(arr: Array<IntArray>): Array<IntArray> {
        val size = max(arr.size, arr[0].size)
        val array = Array(size) { IntArray(size) }

        for (i in arr.indices) {
            System.arraycopy(arr[i], 0, array[i], 0, arr[0].size)
        }
        return array
    }
}