class Solution {
    fun solution(emergency: IntArray) = emergency.map { emergency.sortedDescending().indexOf(it) + 1 }
}