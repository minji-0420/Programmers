class Solution {
    fun solution(i: Int, j: Int, k: Int): Int {
        var result = 0
        for (num in i..j) {
            result += num.toString().count { it == k.toString()[0] }
        }

        return result
    }
}