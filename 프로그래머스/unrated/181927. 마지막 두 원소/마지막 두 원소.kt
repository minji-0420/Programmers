class Solution {
    fun solution(num_list: IntArray): IntArray {
        var answer: IntArray = intArrayOf()
        if (num_list.last() > num_list[num_list.size -2]) {
            answer = num_list.plus(num_list.last() - num_list[num_list.size -2])
        } else {
            answer = num_list.plus(num_list.last() * 2)
        }
        return answer
    }
}