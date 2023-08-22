class Solution {
    fun solution(lottos: IntArray, win_nums: IntArray): IntArray {

        var answer = mutableListOf<Int>()

        val zeroCount = lottos.count { it == 0}
        val intersection = lottos.intersect(win_nums.toList().toSet()).count()

        when (zeroCount + intersection) {
            6 -> answer.add(1)
            5 -> answer.add(2)
            4 -> answer.add(3)
            3 -> answer.add(4)
            2 -> answer.add(5)
            else -> answer.add(6)
        }

        when (intersection) {
            6 -> answer.add(1)
            5 -> answer.add(2)
            4 -> answer.add(3)
            3 -> answer.add(4)
            2 -> answer.add(5)
            else -> answer.add(6)
        }

        return answer.toIntArray()
    }
}