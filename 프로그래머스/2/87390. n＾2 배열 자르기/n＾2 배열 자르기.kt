class Solution {
    fun solution(n: Int, left: Long, right: Long): IntArray {
        var answer = IntArray((right - left).toInt() + 1)

        var count = left

        for (i in answer.indices) {
            val row = (count/n.toLong()).toInt()
            val column = (count % n.toLong()).toInt()
            answer[i] = row.coerceAtLeast(column) + 1
            count ++
        }

        return answer
    }
}