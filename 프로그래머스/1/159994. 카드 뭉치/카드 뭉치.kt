class Solution {
    fun solution(cards1: Array<String>, cards2: Array<String>, goal: Array<String>): String {
        var c1 = 0
        var c2 = 0
        for (g in goal) {
            when {
                c1 < cards1.size && g == cards1[c1] -> c1 ++
                c2 < cards2.size && g == cards2[c2] -> c2 ++
                else -> return "No"
            }
        }
        return "Yes"
    }
}