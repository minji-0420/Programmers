class Solution {
    fun solution(babbling: Array<String>): Int {
        val able = "aya|ye|woo|ma".toRegex()
        val unable = "ayaaya|yeye|woowoo|mama".toRegex()
        return babbling.count() {
            !it.contains(unable) && it.replace(able, "").isEmpty()
        }
    }
}