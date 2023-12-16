class Solution {
    fun solution(arr: IntArray): IntArray {
    return arr.flatMap { num -> List(num) { num } }.toIntArray()
}
    }