class Solution {
    fun solution(num_list: IntArray) = num_list.sortedDescending().take(num_list.size - 5).sorted()
}