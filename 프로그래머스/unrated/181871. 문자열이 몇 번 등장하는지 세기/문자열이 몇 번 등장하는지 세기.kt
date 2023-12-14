class Solution {
    fun solution(myString: String, pat: String): Int {
        var count = 0
        var index = myString.indexOf(pat)
        while (index != -1) {
            count++
            index = myString.indexOf(pat, index + 1)
        }
        return count
    }
}