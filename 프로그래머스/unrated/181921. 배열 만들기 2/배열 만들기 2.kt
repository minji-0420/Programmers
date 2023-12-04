class Solution {
    fun solution(l: Int, r: Int): IntArray {
        val result = (l..r).filter { it.toString().all { digit -> digit == '0' || digit == '5' } }.toIntArray()
        return if (result.isEmpty()) intArrayOf(-1) else result
    }
}