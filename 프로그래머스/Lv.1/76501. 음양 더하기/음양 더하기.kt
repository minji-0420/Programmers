class Solution {
    fun solution(absolutes: IntArray, signs: BooleanArray): Int {
        var array = IntArray(absolutes.size)
        for (i in signs.indices) {
            if (signs[i]) {
                array[i] = absolutes[i]
            } else {
                array[i] = -absolutes[i]
            }
        }
        return array.sum()
    }
}