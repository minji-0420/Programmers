class Solution {
    fun solution(numbers: IntArray, n: Int): Int {
        var result= 0
        for (i in numbers.indices) {
            result += numbers[i]
            if(result > n) {
                break
            }
        }
        return result
    }
}