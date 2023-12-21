class Solution {
    fun solution(picture: Array<String>, k: Int): Array<String> {
        var answer: Array<String> = arrayOf()
        for (pic in picture) {
            answer += List(k) {pic.replace("x", "x".repeat(k)).replace(".", ".".repeat(k)) }

        }
        return answer
    }
}