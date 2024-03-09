class Solution {
    fun solution(clothes: Array<Array<String>>) = clothes.groupBy { it[1] }.values.fold(1) { acc, v -> acc * (v.size + 1) } - 1
}