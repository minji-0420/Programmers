class Solution {
    fun solution(myStr: String): List<String> {
        var answer = myStr.split("[abc]".toRegex()).filter{ it.isNotEmpty() }
        if (answer.isNotEmpty()) return answer else return listOf("EMPTY") 
    }
}