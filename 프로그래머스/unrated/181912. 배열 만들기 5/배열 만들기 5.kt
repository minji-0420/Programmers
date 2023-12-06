class Solution {
    fun solution(intStrs: Array<String>, k: Int, s: Int, l: Int): IntArray {
        val answerList = mutableListOf<Int>()

        for (i in intStrs.indices) {
            val substring = intStrs[i].substring(s until s + l)
            val intValue = substring.toInt()

            if (intValue > k) {
                answerList.add(intValue)
            }
        }

        return answerList.toIntArray()
    }
}