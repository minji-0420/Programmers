class Solution {
    fun solution(elements: IntArray): Int {
        val n = elements.size
        val sums = mutableSetOf<Int>()

        val circle = elements + elements
        for (start in elements.indices) {
            for (end in start until start + n) {
                var sum = 0
                for (i in start..end) {
                    sum += circle[i]
                }
                sums.add(sum)
            }
        }
        return sums.size
    }
}