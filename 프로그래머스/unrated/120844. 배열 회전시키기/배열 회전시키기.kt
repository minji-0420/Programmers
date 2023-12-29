import java.util.Collections
class Solution {
    fun solution(numbers: IntArray, direction: String): IntArray {
        val answer = numbers.toList()
        if (direction == "right") {
            Collections.rotate(answer,1)
        } else {
            Collections.rotate(answer, -1)
        }
        return answer.toIntArray()
    }
}