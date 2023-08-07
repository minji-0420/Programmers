class Solution {
    fun solution(num: Int): Int {

        var count = 0
        var currentNum = num.toLong()

        if (num == 1 ) { return 0 }

        while (count < 500) {

            if (currentNum % 2 == 0L) {
                currentNum /= 2
            } else { currentNum = currentNum * 3 + 1}

            count++

            if (currentNum == 1L) { return count }
        }

        return -1
    }
}