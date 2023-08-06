class Solution {
    fun solution(arr: IntArray, divisor: Int): IntArray {

        var result = ArrayList<Int>()

        for (i in arr.indices) {
            if (arr[i] % divisor == 0) {
                result.add(arr[i])
            }
        }
        return if (result.isNotEmpty()) {
            result.sorted().toIntArray()
        } else {
            intArrayOf(-1)
        }
    }
}