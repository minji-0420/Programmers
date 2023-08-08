class Solution {
    fun solution(k: Int, m: Int, score: IntArray): Int {

        var a = score.sortedDescending()
        var b = a.chunked(m)

        var totalPrice = 0

        for ( i in b.indices) {
        if (b[i].size == m) {
                val min = b[i].minOrNull()
                val boxPrice = min!! * m
                totalPrice += boxPrice
            }
        }
        return if (totalPrice == 0) 0
        
        else totalPrice
    }
}