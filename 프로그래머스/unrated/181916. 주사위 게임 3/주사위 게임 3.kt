import kotlin.math.abs
class Solution {
    fun solution(a: Int, b: Int, c: Int, d: Int): Int {
        val list = listOf(a, b, c, d).sorted()
        val setList = list.toSet()
        val count = list.groupingBy { it }.eachCount()

        var answer: Int = 0

        for ((value, freq) in count) {
            when (setList.size) {
                1 -> answer = 1111 * value
                4 -> answer = list[0]
                2 -> {
                    answer = if (freq == 2) {
                        val otherValue = count.keys.find { it != value } ?: 0
                        (value + otherValue) * abs(value - otherValue)
                    } else {
                        val freq3 = count.filter {it.value == 3}.keys
                        val freq1 = count.filter {it.value == 1}.keys

                        val val1 = freq3.first()
                        val val2 = freq1.first()
                        (10 * val1 + val2) * (10 * val1 + val2)
                    }
                }
                3 -> {
                    val otherValues = count.keys.filter { it != value && count[it] == 1}
                    if (otherValues.size == 2) {
                        answer = otherValues[0] * otherValues[1]
                    }
                }
                else -> 0
            }
        }
        return answer
    }
}