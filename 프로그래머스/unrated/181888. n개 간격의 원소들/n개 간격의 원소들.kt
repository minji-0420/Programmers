class Solution {
    fun solution(num_list: IntArray, n: Int) = num_list.slice(0..num_list.lastIndex step n).toIntArray()
}