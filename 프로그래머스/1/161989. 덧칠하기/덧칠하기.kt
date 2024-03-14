class Solution {
    fun solution(n: Int, m: Int, section: IntArray): Int {
        var answer = 1
        var position = section[0]
        
        for (i in section.indices) {
            if (section[i] <= position + m - 1) continue
            else {
                position = section[i]
                answer ++
            }
        }
        return answer
    }
}