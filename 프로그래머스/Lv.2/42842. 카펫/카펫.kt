class Solution {
    fun solution(brown: Int, yellow: Int): IntArray {
        val total = brown + yellow

        for (width in 1..total) {
            if (total % width == 0) {
                val height = total / width

                if ((width - 2) * (height - 2) == yellow) {
                    return intArrayOf(height, width)
                }
            }
        }
        return intArrayOf()
    }
}