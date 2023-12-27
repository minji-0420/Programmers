class Solution {
    fun solution(angle: Int): Int {
        return if (angle < 90) 1
        else return if (angle == 90) 2
        else return if (angle in 91..179) 3
        else return 4
    }
}