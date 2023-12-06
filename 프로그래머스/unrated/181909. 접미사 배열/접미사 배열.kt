class Solution {
    fun solution(my_string: String) : ArrayList<String>{
        var answer = ArrayList<String>()
        val stringBuilder = StringBuilder()
        for (i in my_string.indices) {
            answer.add(my_string.substring(i, my_string.length))
        }
        answer.sort()
        answer.forEach { stringBuilder.append(it).append("\n") }
        return answer
    }
}