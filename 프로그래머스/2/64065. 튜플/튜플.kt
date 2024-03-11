class Solution {
    fun solution(s: String): IntArray {
        var answer = ArrayList<Int>()
        var list = s.substring(2, s.length - 2).split("},{").sortedBy { it.length }
        
        for (i in list) {
            var arr = i.split(",")
            for (j in arr) {
                if (!answer.contains(j.toInt())) answer.add(j.toInt())
            }
        }
        return answer.toIntArray()
    }
}