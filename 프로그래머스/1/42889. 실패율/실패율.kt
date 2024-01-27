class Solution {
    fun solution(N: Int, stages: IntArray): IntArray {
        var answer = IntArray(N)
        val stage = HashMap<Int, Double>()

        for (i in 1.. N) {
            var failure = 0.0
            val a = stages.count { it == i }.toDouble()
            val b = stages.count { it >= i }.toDouble()

            if (stages.count { it == i } != 0) failure = a / b
            stage[i] = failure
        }
        
        var list = stage.toList()
        list = list.sortedByDescending { it.second }
        
        for (j in list.indices) {
            answer[j] = list[j].first
        }
        return answer
    }
}