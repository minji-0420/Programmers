class Solution {
    fun solution(s: String) = s.toList().groupingBy { it }.eachCount().filter { it.value == 1 }.keys.sorted().joinToString("")
}