class Solution {
    fun solution(k: Int, tangerine: IntArray): Int {
        var answer = 0
        var kk = k
        val list = tangerine.groupBy { it }.values.map{ it.size }.sortedDescending()
        
        for (i in list) {
            if (kk <= 0) break
            kk -= i
            answer++
        }
        return answer
    }
}