class Solution {
    fun solution(binomial: String): Int {
        var result = binomial.split(" ")
        var a = result[0].toInt()
        var op = result[1]
        var b = result[2].toInt()
        return when (op) {
            "+" -> a + b
            "-" -> a - b
            "*" -> a * b
            else -> throw IllegalArgumentException("Invalid")
        }
    }
}