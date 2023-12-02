class Solution {
    fun solution(num_list: IntArray): Int {
        var sbOdd = StringBuilder()
        var sbEven = StringBuilder()
        for ( i in num_list.indices) {
            if (num_list[i] % 2 == 1) {
                sbOdd.append(num_list[i])
            } else {
                sbEven.append(num_list[i])
            }
        }
        val sumOdd = if (sbOdd.isNotEmpty()) sbOdd.toString().toInt() else 0
        val sumEven = if (sbEven.isNotEmpty()) sbEven.toString().toInt() else 0
        return sumOdd + sumEven
    }
}