class Solution {
    fun solution(s: String, skip: String, index: Int): String {
        
        var filter = ('a'..'z').filter{ it !in skip}
        
        return s.map { filter[(filter.indexOf(it) + index) % filter.size]}.joinToString("")
    }
}