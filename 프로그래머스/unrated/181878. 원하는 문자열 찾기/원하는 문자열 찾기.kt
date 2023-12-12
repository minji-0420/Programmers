class Solution {
    fun solution(myString: String, pat: String): Int {
      val myStrings = myString.lowercase()
        val pats = pat.lowercase()
        return if (myStrings.contains(pats)) 1 else 0
    }
}