class Solution {
    fun solution(n: Int): Int {
        var answer = n
        var count = 1
        while (count <= answer) {
            if ((count % 3 == 0) || count.toString().contains("3")) {
                answer ++
            }
            count ++
        }
        return answer
    }
}