class Solution {
    fun solution(sides: IntArray): Int {
        var count = intArrayOf()
        sides.sort()
        for (i in 1..sides[1]) {
            if (i + sides[0] > sides[1]) {
                count += i
            }
        }
        for (j in sides[1] + 1 until sides[0] + sides[1]) {
            count += j
        }
        return count.size
    }
}