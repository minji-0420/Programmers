class Solution {
    fun solution(numbers: IntArray): IntArray {
        var answer = mutableListOf<Int>()
        
        for (i in numbers.indices) {
            for (j in i + 1 until numbers.size) {
                answer.add(numbers[i] + numbers[j])
            }
        }
        return answer.distinct().sorted().toIntArray()
    }
}