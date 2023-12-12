class Solution {
    fun solution(arr: IntArray): Int {
        var x = 0
        var currentArr = arr.copyOf()

        while (true) {
            val nextArr = currentArr.map {
                when {
                    it >= 50 && it % 2 == 0 -> it / 2
                    it < 50 && it % 2 == 1 -> it * 2+ 1
                    else -> it
                }
            }.toIntArray()
            
            if (currentArr.contentEquals(nextArr)) {
                break
            }
            currentArr = nextArr.copyOf()
            x ++
        }
        return x
    }
}