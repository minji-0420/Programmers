class Solution {
    fun solution(chicken: Int): Int {
        var total = 0
        var coupons = chicken

        while (coupons >= 10) {
            total += coupons / 10
            coupons = coupons / 10 + coupons % 10
        }
        return total
    }
}