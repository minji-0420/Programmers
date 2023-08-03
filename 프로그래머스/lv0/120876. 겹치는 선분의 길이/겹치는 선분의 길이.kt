import kotlin.math.abs

class Solution {
    fun solution(lines: Array<IntArray>): Int =

        lines.map { line ->
            List(abs(line[1] - line[0])) {r ->
                val x = line[0] + r
                Pair(x, x)
            }
        }
            .flatten()
            .groupBy { it }
            .filter { it.value.size > 1 }
            .size
}
