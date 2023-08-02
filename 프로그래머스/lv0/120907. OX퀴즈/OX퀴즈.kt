class Solution {
    fun solution(quiz: Array<String>): Array<String> {
        val result = mutableListOf<String>()

        for (str in quiz) {
            val parts = str.split(" ")
            val num1 = parts[0].toInt()
            val operator = parts[1]
            val num2 = parts[2].toInt()
            val equal = parts[3]
            val resultNumber = parts[4].toInt()
            
            val calculatedAnswer = when (operator) {
                "+" -> num1 + num2
                "-" -> num1 - num2
                else -> 0
            }

            if (calculatedAnswer == resultNumber) {
                result.add("O")
            } else {
                result.add("X")
            }
        }

        return result.toTypedArray()
    }
}