class Solution {
    fun solution(before: String, after: String) = if (after.toList().sorted() == before.toList().sorted()) 1 else 0
}