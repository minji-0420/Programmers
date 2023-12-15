class Solution {
    fun solution(myString: String): IntArray {
        var answer: IntArray = intArrayOf()
        var result = myString.split('x')
        for (string in result) {
            answer += string.length
        }
        return answer
    }
}