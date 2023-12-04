class Solution {
    fun solution(arr: IntArray): IntArray {
        var stk: IntArray = intArrayOf()

        var i = 0
        while (i < arr.size) {
            if (stk.isEmpty()) {
                stk = stk.plus(arr[i])
                i++
            } else {
                if (stk.last() < arr[i]) {
                    stk = stk.plus(arr[i])
                    i++
                } else {
                    stk = stk.copyOfRange(0, stk.size - 1)
                }
            }
        }
        return stk
    }
}