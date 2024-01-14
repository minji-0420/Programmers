class Solution {
    fun solution(s: String): String { 
        var list = s.split(" ")
        val result = list.joinToString(" ") { word ->
            word.mapIndexed { index, char ->
                if (index % 2 == 0) {
                    char.uppercaseChar()
                } else {
                    char.lowercaseChar()
                }
            }.joinToString("")
        }
        return result
    }
}