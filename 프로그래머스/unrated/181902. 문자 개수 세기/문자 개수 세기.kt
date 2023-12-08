class Solution {
    fun solution(my_string: String): IntArray {
        val answer = IntArray(52)
        for (i in my_string.indices) {
            when (val char = my_string[i]) {
                in 'A'..'Z' -> answer[char - 'A']++
                in 'a'..'z' -> answer[char - 'a' + 26]++
            }
        }
        return answer
    }
}