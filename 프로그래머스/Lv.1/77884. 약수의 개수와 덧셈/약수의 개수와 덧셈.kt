class Solution {
    fun solution(left: Int, right: Int): Int {
        var answer: Int = 0

        for (num in left..right) {
            var divisorCount = 0
            for (i in 1..num) {
                if (num % i == 0) {
                    divisorCount++
                }
            }

            if (divisorCount % 2 == 0) {
                answer += num
            } else {
                answer -= num
            }
        }

        return answer
    }
}