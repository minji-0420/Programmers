class Solution {
    fun solution(numbers: IntArray): Int {

        var sum = numbers.sum()
        var answer = 45 - sum
        
        return answer
    }
}