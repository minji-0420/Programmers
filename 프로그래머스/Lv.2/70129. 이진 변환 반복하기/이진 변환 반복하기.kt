class Solution {
    fun solution(s: String): IntArray {
        var answer = IntArray(2)
        var string = s

        while (string != "1") {
            answer[0] ++
            answer[1] += string.replace("1", "").length
            string = string.replace("0", "").length.toString(2)
        }
        return answer
    }
}