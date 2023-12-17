class Solution {
    fun solution(strArr: Array<String>): Int {
        val result = strArr.groupBy { it.length }
        val groupSizes = result.values.map { it.size }
        return groupSizes.maxOrNull() ?: 0
    }
}