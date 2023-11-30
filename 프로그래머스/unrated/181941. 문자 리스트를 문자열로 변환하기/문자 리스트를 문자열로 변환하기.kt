class Solution {
   fun solution(arr: Array<String>): String {
        val result = StringBuilder()
        for (i in arr.indices) {
            result.append(arr[i])
        }
        return result.toString()
    }
}