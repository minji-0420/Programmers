class Solution {
    fun solution(money: Int): IntArray {
        var price = 5500
        var max = money / price
        var rest = money % price

        return intArrayOf(max, rest)
    }
       
}