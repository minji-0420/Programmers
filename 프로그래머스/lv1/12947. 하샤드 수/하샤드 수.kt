class Solution {
    fun solution(x: Int): Boolean {

        var a = x.toString()

        var b = a.map { it.toString().toInt()}

        var c = b.sum()
        
        var d = x % c

        if(d == 0) return true
        
        return false
    }
}