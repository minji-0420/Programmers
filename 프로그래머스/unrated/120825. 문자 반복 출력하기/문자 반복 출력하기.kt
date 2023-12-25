class Solution {
    fun solution(my_string: String, n: Int): String {
       val stringBuilder = StringBuilder()
        for (str in my_string) {
            stringBuilder.append(str.toString().repeat(n))
        }
        return stringBuilder.toString()
    }
}