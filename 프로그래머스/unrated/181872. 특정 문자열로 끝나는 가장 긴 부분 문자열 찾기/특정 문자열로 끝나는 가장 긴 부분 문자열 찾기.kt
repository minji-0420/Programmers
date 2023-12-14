class Solution {
    fun solution(myString: String, pat: String): String {
        var answer: String = ""
        for (i in myString.indices) {
            if (myString.slice(0..i).endsWith(pat)) {
                answer = myString.slice(0..i)
            }
        }
        return answer
    }
}