class Solution {
    fun solution(my_string: String, indices: IntArray): String {
        val sortedIndices = indices.sortedDescending().toIntArray()
        val result = StringBuilder(my_string)

        for (index in sortedIndices) {
            if (index < result.length) {
                result.deleteCharAt(index)
            }
        }

        return result.toString()
    }
}