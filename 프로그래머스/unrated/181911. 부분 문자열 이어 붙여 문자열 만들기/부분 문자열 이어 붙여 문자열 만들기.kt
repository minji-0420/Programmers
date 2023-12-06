class Solution {
    fun solution(my_strings: Array<String>, parts: Array<IntArray>): String {
        var answer: String = ""
        for (i in my_strings.indices) {
            var subString = my_strings[i].substring(parts[i][0]..parts[i][1])
            answer += subString
        }
        return answer
    }
}