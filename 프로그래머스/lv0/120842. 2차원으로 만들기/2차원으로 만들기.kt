class Solution {
    fun solution(num_list: IntArray, n: Int): Array<IntArray> {
        
        val chunkedList: List<List<Int>> = num_list.toList().chunked(n)

        return chunkedList.map { it.toIntArray() }.toTypedArray()
    }
}