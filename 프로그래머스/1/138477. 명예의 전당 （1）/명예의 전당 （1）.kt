class Solution {
    fun solution(k: Int, score: IntArray): IntArray {
        var answer: IntArray = intArrayOf()
        val kList = mutableListOf<Int>()
        
        for (s in score) {
            if (kList.size < k) {
                kList += s
            } else if (kList[0] < s) {
                kList[0] = s
            }
            kList.sort()
            answer += kList[0]
        }
        return answer
    }
}