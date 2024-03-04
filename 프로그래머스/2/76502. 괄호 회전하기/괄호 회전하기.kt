import java.util.ArrayDeque

class Solution {
    fun solution(s: String): Int {
        var answer = 0
        val n = s.length
        val stack = ArrayDeque<Char>()

        repeat(n) { rotate ->
            var isValid = true
            for (i in 0 until n) {
                val rotated = s[(i + rotate) % n]
                if (rotated == '(' || rotated == '[' || rotated == '{') {
                    stack.push(rotated)
                } else {
                    if (stack.isEmpty() ||
                        (rotated == ')' && stack.peek() != '(') ||
                        (rotated == ']' && stack.peek() != '[') ||
                        (rotated == '}' && stack.peek() != '{')
                        ) {
                        isValid = false
                        break
                    }
                    stack.pop()
                }
            }
            if (isValid && stack.isEmpty()) {
                answer ++
            }
            stack.clear()
        }
        return answer
    }
}