class Solution {
    fun solution(names: Array<String>): Array<String> {
        var answer: Array<String> = arrayOf<String>()
        var result = names.toList().chunked(5)
        for (i in result.indices) {
            answer += result[i][0]
        }
        return answer
    }
}