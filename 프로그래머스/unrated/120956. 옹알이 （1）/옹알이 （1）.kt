class Solution {
    fun solution(babbling: Array<String>): Int {
        var answer: Int = 0
        answer = babbling.count { it ->
            it.isNotEmpty() && it.split("aya", "ye", "woo", "ma").none {
            it.isNotEmpty()
        } }
        return answer
    }
}