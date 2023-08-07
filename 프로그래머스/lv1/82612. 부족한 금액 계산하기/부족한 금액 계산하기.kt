class Solution {
    fun solution(price: Int, money: Int, count: Int): Long {
        var sumPrice:Long = 0
        for (i in 1..count) {
            val currentPrice = price * i
            sumPrice += currentPrice
        }
        return if (money - sumPrice < 0) {
            (sumPrice - money).toLong()
        } else 0
    }
}