class Solution {
    fun solution(n: Int, lost: IntArray, reserve: IntArray): Int {
        var answer = 0
        val students = IntArray(n) { 1 }
        
        for (l in lost) {
            students[l - 1]--
        }
        
        for (r in reserve) {
            students[r - 1]++
        }

        for (i in 0 until n) {
            if (students[i] == 0) {
       
                if (i > 0 && students[i - 1] == 2) {
                    students[i]++
                    students[i - 1]--
                }
             
                else if (i < n - 1 && students[i + 1] == 2) {
                    students[i]++
                    students[i + 1]--
                }
            }
        }
        
        answer = students.count { it > 0 }
        
        return answer
    }
}