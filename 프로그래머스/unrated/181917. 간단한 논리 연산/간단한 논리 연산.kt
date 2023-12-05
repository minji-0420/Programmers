class Solution {
    fun solution(x1: Boolean, x2: Boolean, x3: Boolean, x4: Boolean): Boolean {
       return if((x1 || x2) && (x3 || x4)) true else false
    }
}