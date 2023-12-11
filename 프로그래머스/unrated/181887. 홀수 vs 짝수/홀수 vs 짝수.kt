class Solution {
    fun solution(num_list: IntArray): Int {
        var odd = 0
        var even = 0
        for (i in num_list.indices) {
            if (i % 2 == 0) {
                odd += num_list[i]
            } else {
                even += num_list[i]
            }
        }
        return if (even > odd) even else odd
    }
}