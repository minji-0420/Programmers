class Solution {

    val result = mutableListOf<Int>()
    fun solution(food: IntArray): String {

        for (i in 1 until food.size) {
            if (food[i] % 2 == 1) {
                val array = Array((food[i] - 1) / 2) { i }
                result.addAll(array)
            } else {
                val array = Array(food[i]/2) { i }
                result.addAll(array).toString()
            }
        }
        return (result + 0 + result.reversed()).joinToString("")
    }
}