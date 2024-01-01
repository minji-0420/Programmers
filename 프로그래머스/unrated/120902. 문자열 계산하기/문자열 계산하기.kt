class Solution {
    fun solution(my_string: String): Int {
        val tokens = my_string.split(' ')

        var result = tokens[0].toInt()

        for (i in 1 until tokens.size step 2) {
            val operator = tokens[i]
            val operand = tokens[i + 1].toInt()

            when (operator) {
                "+" -> result += operand
                "-" -> result -= operand
                else -> throw IllegalArgumentException("Invalid operator: $operator")
            }
        }

        return result
    }
}