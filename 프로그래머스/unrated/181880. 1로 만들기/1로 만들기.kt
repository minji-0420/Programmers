class Solution {
    fun solution(num_list: IntArray): Int {
        var answer: Int = 0
        for (num in num_list) {
            var currentNum = num
            while (currentNum != 1) {
                if (currentNum % 2 == 0) {
                    currentNum /= 2
                } else {
                    currentNum = (currentNum - 1) / 2
                }
                answer ++
            }
        }
        return answer
    }
}