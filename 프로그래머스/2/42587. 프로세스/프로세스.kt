class Solution {
    fun solution(priorities: IntArray, location: Int): Int {
        var answer = 0
        val queue = priorities.mapIndexed { index, priority -> index to priority }.toMutableList()
        while (true) {
            val cur = queue.removeAt(0)
            if (queue.any { it.second > cur.second }) {
                queue.add(cur)
            } else {
                answer ++
                if (cur.first == location) {
                    return answer
                }
            }
        }
    }
}