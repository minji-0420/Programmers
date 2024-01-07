class Solution {
    fun solution(score: Array<IntArray>): IntArray {
        var average = score.map { it.average() }
        return average.map { average.sortedDescending().indexOf(it) + 1 }.toIntArray()
    }
}