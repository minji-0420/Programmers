class Solution {
    fun solution(strlist: Array<String>): IntArray {
        var answer: IntArray = intArrayOf()
        for (str in strlist) {
            answer += str.length
        }
        return answer
    }
}