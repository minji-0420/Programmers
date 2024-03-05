class Solution {
    fun solution(want: Array<String>, number: IntArray, discount: Array<String>): Int {
       var count = 0
        
        for (i in 0 until discount.size - 10 + 1) {
            val discountCopy = discount.copyOfRange(i, i + 10)
            
            var flag = true
            for (w in want.indices) {
                val c = discountCopy.count { it == want[w] }
                if (number[w] != c) {
                    flag = false
                    break
                }
            }
            if (flag) count ++
        }
        return count
    }
}