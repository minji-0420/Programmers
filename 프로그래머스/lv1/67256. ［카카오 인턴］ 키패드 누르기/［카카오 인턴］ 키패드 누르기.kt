import kotlin.math.abs
class Solution {
    // 1 2 3 [0,0] [0,1] [0,2]
    // 4 5 6 [1,0] [1,1] [1,2]
    // 7 8 9 [2,0] [2,1] [2,2]
    // * 0 # [3,0] [3,1] [3,2]
    fun solution(numbers: IntArray, hand: String): String {
        var answer = ""
        var leftPos = Pair(3, 0)
        var rightPos = Pair(3, 2)

        for (num in numbers) {
            val numPos = when (num) {
                1, 4, 7 -> Pair((num - 1) / 3, 0)
                3, 6, 9 -> Pair((num - 3) / 3, 2)
                2 -> Pair(0, 1)
                5 -> Pair(1, 1)
                8 -> Pair(2, 1)
                0 -> Pair(3, 1)
                else -> Pair(-1, -1)
            }

            if (numPos.second == 0) {
                answer += "L"
                leftPos = numPos
            } else if (numPos.second == 2) {
                answer += "R"
                rightPos = numPos
            } else {
                val leftDistance = abs(leftPos.first - numPos.first) + abs(leftPos.second - numPos.second)
                val rightDistance = abs(rightPos.first - numPos.first) + abs(rightPos.second - numPos.second)

                if (leftDistance < rightDistance || (leftDistance == rightDistance && hand == "left")) {
                    answer += "L"
                    leftPos = numPos
                } else {
                    answer += "R"
                    rightPos = numPos
                }
            }
        }
        return answer
    }
}