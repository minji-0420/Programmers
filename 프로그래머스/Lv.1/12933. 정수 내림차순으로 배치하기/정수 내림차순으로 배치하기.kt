class Solution {
    fun solution(n: Long) = n.toString().map(Char::digitToInt).sortedDescending().joinToString("").toLong()
}