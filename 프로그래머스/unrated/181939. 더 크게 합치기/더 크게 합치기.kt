class Solution {
    fun solution(a: Int, b: Int): Int {
        var c = (a.toString() + b.toString()).toInt()
        var d = (b.toString() + a.toString()).toInt()
        return if (c >= d) {
            c
        } else d
    }
}