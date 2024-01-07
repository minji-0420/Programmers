import kotlin.math.abs

class Solution {
    fun solution(numlist: IntArray, n: Int) = numlist.sortedWith(compareBy({ abs(n - it) }, { -it }))
}