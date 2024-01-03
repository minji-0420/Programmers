class Solution {
    fun solution(polynomial: String): String {
        var x = 0
        var num = 0

        for (str in polynomial.split(" ".toRegex())) {
            if (str.contains("x")) {
                x += if (str == "x") 1 else str.replace("x".toRegex(), "").toInt()
            } else if (str != "+") {
                num += str.toInt()
            }
        }
        return (if (x != 0) if (x > 1) "${x}x" else "x" else "") + if (num != 0) (if (x != 0) " + " else "") + num else if (x == 0) "0" else ""
    }
}