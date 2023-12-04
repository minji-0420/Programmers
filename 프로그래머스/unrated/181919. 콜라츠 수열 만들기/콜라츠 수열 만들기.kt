class Solution {
    fun solution(n: Int): IntArray {
        var answer: MutableList<Int> = mutableListOf()
        var num = n.toLong()

        while (num != 1L) {
            answer.add(num.toInt())

            if (num % 2 == 0L) {
                num /= 2
            } else {
                num = 3 * num + 1
            }
        }
        answer.add(1)
        return answer.toIntArray()
    }
}