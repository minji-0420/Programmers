class Solution {
    fun solution(n: Int) = (1..n).count{ num -> n % num == 0}
}