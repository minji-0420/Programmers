class Solution {
    fun solution(my_string: String, queries: Array<IntArray>): String {
        var answer = my_string
        for (query in queries) {
            val start = query[0]
            val end = query[1]
            answer = answer.substring(0 until start) + answer.substring(start..end).reversed() + answer.substring(
                end + 1 until answer.length
            )
        }
        return answer
    }
}