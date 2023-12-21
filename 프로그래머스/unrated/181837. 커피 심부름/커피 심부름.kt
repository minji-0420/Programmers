class Solution {
    fun solution(order: Array<String>): Int {
        var answer = mutableListOf<Int>()
        for (coffee in order) {
            answer += if (coffee.contains("latte")) {
                5000
            } else {
                4500
            }
        }
        return answer.sum()
    }
}