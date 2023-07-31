class Solution {
    fun solution(n: Int, numlist: IntArray): IntArray {

        val filter = numlist.filter {
            it.mod(n) == 0
        }

        return filter.toIntArray()
    }
}