class Solution {
    fun solution(myString: String): String {
        var result = myString.toList().toMutableList()
        for (i in result.indices) {
            if (result[i].toInt() < 108) {
                result[i] = 'l'
            }
        }
        return result.joinToString("")
    }
}