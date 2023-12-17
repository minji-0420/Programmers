import kotlin.math.ceil
import kotlin.math.log2
import kotlin.math.pow

class Solution {
    fun solution(arr: IntArray): IntArray {
        val newSize = 2.0.pow(ceil(log2(arr.size.toDouble()))).toInt()
        return arr + IntArray(newSize - arr.size) { 0 }
    }
}