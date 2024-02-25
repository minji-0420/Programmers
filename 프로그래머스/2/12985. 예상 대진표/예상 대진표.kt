class Solution {
    fun solution(n: Int, a: Int, b: Int): Int {
        var answer = 0
        var x = a
        var y = b
        while (x != y) {
            x = (x + 1) / 2
            y = (y + 1) / 2
            answer ++
        }

        return answer
    }
}