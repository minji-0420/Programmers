class Solution {
    fun solution(num_list: IntArray): Int {
        var answer: Int = 0
        val multiple = num_list.reduce { acc, i -> acc * i}
        answer = (num_list.sum())*(num_list.sum())

        return if (multiple > answer) 0 else 1
    }
}