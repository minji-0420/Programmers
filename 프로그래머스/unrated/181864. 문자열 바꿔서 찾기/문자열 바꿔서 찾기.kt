class Solution {
    fun solution(myString: String, pat: String): Int {
        var result = ""
        for (string in myString) {
            when (string) {
                'A' -> result += 'B'
                'B' -> result += 'A'
                else -> result += string
            }
        }
        return if (result.contains(pat)) 1 else 0
    }
}