class Solution {
    fun solution(my_string: String, m: Int, c: Int): String {
        var answer: String = ""
        var splitString = my_string.chunked(m)
        for(i in splitString.indices) {
            answer += splitString[i][c-1]
        }
        return answer
    }
}