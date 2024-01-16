class Solution {
    fun solution(s: String) = s.withIndex().map { (index, word) ->
        s.slice(0 until index).lastIndexOf(word).let {
            if (it >= 0) index - it else it
        }
    }
}