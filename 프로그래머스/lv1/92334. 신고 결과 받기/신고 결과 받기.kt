class Solution {
    fun solution(id_list: Array<String>, report: Array<String>, k: Int): IntArray {
        
        val reportSet = report.toSet()
        val reportSplit = reportSet.map {
            val parts = it.split(" ")
            Pair(parts[0], parts[1])
        }
        
        val reporters = mutableMapOf<String, MutableSet<String>>()

        for ((reporter, reportedUser) in reportSplit) {
            
            if (reporters.containsKey(reportedUser)) {
                reporters[reportedUser]!!.add(reporter)
            } else {
                reporters[reportedUser] = mutableSetOf(reporter)
            }
        }
        
        val answer = IntArray(id_list.size)

        for (i in id_list.indices) {
            val id = id_list[i]

            for ((reportedUser, reportersSet) in reporters) {
                if (reportersSet.size >= k && id in reportersSet) {
                    answer[i]++
                }
            }
        }

        return answer
    }
}