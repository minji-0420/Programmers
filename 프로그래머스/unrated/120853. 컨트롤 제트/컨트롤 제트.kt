class Solution {
    fun solution(s: String): Int {
        var answer: Int = 0
        var result = s.split(" ").toMutableList()
        while (result.contains("Z")) {
            result.removeAt(result.indexOf("Z") - 1)
            result.removeAt(result.indexOf("Z"))
        }
        for (string in result) answer += string.toInt()
        return answer
    }
}