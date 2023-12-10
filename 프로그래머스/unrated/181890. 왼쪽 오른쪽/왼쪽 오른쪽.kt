class Solution {
    fun solution(str_list: Array<String>): Array<String> {
        var answer: Array<String> = arrayOf<String>()
        var index = 0
        for (i in str_list.indices) {
            if (str_list[i] == "l") {
                index = i
                answer = str_list.slice(0 until index).toTypedArray()
                break
            } else if (str_list[i] == "r") {
                index = i
                answer = str_list.slice(index+1..str_list.lastIndex).toTypedArray()
                break
            } 
        }
        return answer
    }
}