class Solution {
    fun solution(t: String, p: String): Int {
        val pInt = p.toLong()
        var count = 0

        for (i in 0 until t.length - p.length + 1) {
            val tSubstring = t.substring(i, i + p.length).toLong()

            if (tSubstring <= pInt) {
                count ++
            }
        }
        return count
    }
}