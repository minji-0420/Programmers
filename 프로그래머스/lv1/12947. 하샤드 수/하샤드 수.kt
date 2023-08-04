class Solution {
    fun solution(x: Int): Boolean {
        val c = x.toString().sumOf { it - '0' }
        if(x % c == 0) return true
        
        return false
    }
}