class Solution {
    fun solution(nums: IntArray): Int {

        var answer = 0

        for (i in nums.indices) {
            for (j in i+1 until nums.size) {
                for (k in j+1 until nums.size) {
                    var a = nums[i] + nums[j] + nums[k]
                    if (isPrime(a)) {
                        answer ++
                    }
                }
            }
        }
        return answer
    }

    private fun isPrime(n:Int) = n > 1 && (2 until n).none {n % it == 0}
}