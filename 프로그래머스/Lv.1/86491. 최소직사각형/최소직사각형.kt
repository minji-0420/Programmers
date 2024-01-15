import kotlin.math.max
import kotlin.math.min

class Solution {
    fun solution(sizes: Array<IntArray>): Int {
        var maxWidth = 0
        var maxHeight = 0

        for (size in sizes) {
            var width = size[0]
            var height = size[1]

            maxWidth = maxOf(maxWidth, max(width, height))
            maxHeight = maxOf(maxHeight, min(width, height))
        }

        return maxWidth * maxHeight
    }
}