class Solution {
    fun solution(str_list: Array<String>, ex: String): String {
        var answer = ""
        for (str in str_list) {
            if(!str.contains(ex)) {
                answer += str
            }
        }
        return answer
    }
}