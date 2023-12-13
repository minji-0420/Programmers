class Solution {
    fun solution(strArr: Array<String>): Array<String> {
        var answer: Array<String> = arrayOf<String>()
        for (i in strArr.indices) {
            if (i % 2 == 0) {
                answer += strArr[i].lowercase()
            } else {
                answer += strArr[i].uppercase()
            }
        }
        return answer
    }
}