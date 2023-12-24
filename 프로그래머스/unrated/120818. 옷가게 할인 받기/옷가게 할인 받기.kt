class Solution {
    fun solution(price: Int): Int {
        return when (price) {
            in 100000 until 300000 -> (price * 0.95).toInt()
            in 300000 until 500000 -> (price * 0.9).toInt()
            in 500000 .. 1000000 -> (price * 0.8).toInt()
            else -> price
        }
    }
}