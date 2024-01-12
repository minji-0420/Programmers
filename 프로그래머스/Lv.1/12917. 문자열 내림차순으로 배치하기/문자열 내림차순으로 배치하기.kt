class Solution {
    fun solution(s: String): String {
        val byteArray = s.toCharArray()
        byteArray.sortDescending()
        return String(byteArray)
    }
}