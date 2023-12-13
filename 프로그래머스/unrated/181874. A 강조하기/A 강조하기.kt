class Solution {
    fun solution(myString: String): String {
        var answer: String = ""
        for (i in myString.indices) {
            if (myString[i] == 'a') {
                answer += myString[i].uppercase()
            } else if (myString[i] == 'A') {
                answer += 'A'
            } else {
                answer += myString[i].lowercase()
            }
        }
        return answer
    }
}