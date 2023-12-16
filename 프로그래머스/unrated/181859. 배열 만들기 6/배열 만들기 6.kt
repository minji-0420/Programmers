class Solution {
    fun solution(arr: IntArray): IntArray {
        var stk: MutableList<Int> = mutableListOf()

        for (i in arr.indices) {
            val lastElement = stk.lastOrNull()

            if (stk.isEmpty() || lastElement != arr[i]) {
                stk.add(arr[i])
            } else {
                stk.removeAt(stk.size - 1)
            }
        }

        return if (stk.isNotEmpty()) stk.toIntArray() else intArrayOf(-1)
    }
}