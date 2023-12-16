class Solution {
    fun solution(arr: IntArray, flag: BooleanArray): IntArray {
        var answer = mutableListOf<Int>()
        for (i in flag.indices) {
            if(flag[i]) {
                answer.addAll(List(arr[i] * 2) { arr[i]} )
            } else {
                var remove = arr[i]
                answer = answer.dropLast(remove).toMutableList()
            }
        }
        return answer.toIntArray()
    }
}