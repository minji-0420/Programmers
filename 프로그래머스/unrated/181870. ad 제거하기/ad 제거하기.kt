class Solution {
    fun solution(strArr: Array<String>): Array<String> {
        var answer: Array<String> = arrayOf<String>()
        for (str in strArr) {
            if (!str.contains("ad")) {
                answer += str
            }
        }
        return answer
    }
}