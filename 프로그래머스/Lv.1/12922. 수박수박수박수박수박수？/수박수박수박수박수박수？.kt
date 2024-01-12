class Solution {
    fun solution(n: Int) = "수박".repeat(n / 2) + if (n % 2 == 0) "" else "수"
}