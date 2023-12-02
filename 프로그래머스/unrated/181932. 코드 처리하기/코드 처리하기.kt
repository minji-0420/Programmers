class Solution {
    fun solution(code: String): String {
        var mode = 0

        var answer = StringBuilder()

        for (i in code.indices) {
            if (code[i] == '1') {
                mode = 1 - mode
            } else {
                if ((mode == 0 && i % 2 == 0) || (mode == 1 && i % 2 != 0)) {
                    answer.append(code[i])
                }
            }
        }
        return if (answer.isEmpty()) "EMPTY" else answer.toString()
    }
}