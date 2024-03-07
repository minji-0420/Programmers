class Solution {
    fun solution(citations: IntArray): Int {
        val sorted = citations.sortedDescending()
        var hI = 0

        for (i in sorted.indices) {
            if (sorted[i] >= i + 1) {
                hI = i + 1
            } else { break }
        }
        return hI
    }
}