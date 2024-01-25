import java.lang.Math.sqrt

class Solution {
    fun solution(number: Int, limit: Int, power: Int): Int {
        var answer = 0
        
        for (i in 1..number) {
            val sqrt = sqrt(i.toDouble()).toInt()
            var count = 0
            
            for (j in 1..sqrt) {
                if (i % j == 0) {
                    if (i / j == j) count += 1
                    if (i / j != j) count += 2
                }
            }
            
            if (count > limit) answer += power
            if (count <= limit) answer += count
        }
        
        return answer
    }
}