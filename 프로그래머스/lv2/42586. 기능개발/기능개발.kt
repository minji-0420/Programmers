class Solution {
    fun solution(progresses: IntArray, speeds: IntArray): IntArray {

        val answer = mutableListOf<Int>()

        var i = 0 
        while (i < progresses.size) {
            var count = 0 
            while (i < progresses.size && progresses[i] >= 100) {
                i++
                count++
            }
            if (count > 0) {
                answer.add(count)
            }
            for (j in i until progresses.size) {
                progresses[j] += speeds[j]
            }
        }

        return answer.toIntArray()
    }
}