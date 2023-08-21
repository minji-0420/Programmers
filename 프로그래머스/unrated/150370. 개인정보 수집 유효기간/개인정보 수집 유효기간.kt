import java.time.LocalDate
import java.time.format.DateTimeFormatter

class Solution {
    fun solution(today: String, terms: Array<String>, privacies: Array<String>): IntArray {

        val termsSplit = terms.map{
            val parts = it.split(" ")
            Pair(parts[0], parts[1].toInt())
        }
// "2022.05.19"	["A 6", "B 12", "C 3"]	["2021.05.02 A", "2021.07.01 B", "2022.02.19 C", "2022.02.20 C"]

        val todayDate = LocalDate.parse(today, DateTimeFormatter.ofPattern("yyyy.MM.dd"))

        var answer = mutableListOf<Int>()

        for ( i in privacies.indices ) {
            val parts = privacies[i].split(" ")
            val privacyDate = LocalDate.parse(parts[0], DateTimeFormatter.ofPattern("yyyy.MM.dd"))
            val termIndex = termsSplit.indexOfFirst { it.first == parts[1] }

            if (termIndex != -1) {
                val termMonth = termsSplit[termIndex].second
                val privacyDateWithTerm = privacyDate.plusMonths(termMonth.toLong())

                if (privacyDateWithTerm.isBefore(todayDate) || privacyDateWithTerm == todayDate ) {
                    answer.add(i+1)
                }
            }
        }
        return answer.toIntArray()
    }
}