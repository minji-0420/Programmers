import java.time.LocalDate
class Solution {
    fun solution(a: Int, b: Int): String {
        val base = LocalDate.of(2016, 1, 1)
        val date = base.plusMonths(a.toLong() - 1).plusDays(b.toLong() - 1)
        val day = date.dayOfWeek
        return day.toString().substring(0,3)
    }
}