class Solution {
    fun solution(my_string: String, queries: Array<IntArray>): String {
        var result = my_string.toCharArray()

        for (query in queries) {
            val start = query[0]
            val end = query[1]

            reverseSubstring(result, start, end)
        }

        return result.joinToString("")
    }

    private fun reverseSubstring(array: CharArray, start: Int, end: Int) {
        var i = start
        var j = end

        while (i < j) {
            val temp = array[i]
            array[i] = array[j]
            array[j] = temp

            i++
            j--
        }
    }
}