class Solution {
    fun solution(sides: IntArray): Int {
        var list = sides.sortedDescending()
        return if (list[0] < list[1] + list[2]) 1 else 2
    }
}