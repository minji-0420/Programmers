class Solution {
    // RT TR
    // CF FC
    // JM MJ
    // AN NA
    fun solution(survey: Array<String>, choices: IntArray): String {
        val adjustedChoices = IntArray(choices.size)

        for (i in choices.indices) {
            when (choices[i]) {
                1 -> adjustedChoices[i] = 3
                2 -> adjustedChoices[i] = 2
                3 -> adjustedChoices[i] = 1
                4 -> adjustedChoices[i] = 0
                5 -> adjustedChoices[i] = 1
                6 -> adjustedChoices[i] = 2
                7 -> adjustedChoices[i] = 3
                else -> adjustedChoices[i] = -1
            }
        }

        var r = 0
        var t = 0
        var c = 0
        var f = 0
        var j = 0
        var m = 0
        var a = 0
        var n = 0

        for (i in adjustedChoices.indices) {
            when (survey[i]) {
                "RT", "TR" -> if ((survey[i][0] == 'R' && choices[i] < 4) ||(survey[i][0] == 'T' && choices[i] > 4)) r += adjustedChoices[i] else t += adjustedChoices[i]
                "CF", "FC" -> if ((survey[i][0] == 'C' && choices[i] < 4) ||(survey[i][0] == 'F' && choices[i] > 4)) c += adjustedChoices[i] else f += adjustedChoices[i]
                "JM", "MJ" -> if ((survey[i][0] == 'J' && choices[i] < 4) ||(survey[i][0] == 'M' && choices[i] > 4)) j += adjustedChoices[i] else m += adjustedChoices[i]
                "AN", "NA" -> if ((survey[i][0] == 'A' && choices[i] < 4) ||(survey[i][0] == 'N' && choices[i] > 4)) a += adjustedChoices[i] else n += adjustedChoices[i]
            }
        }

        val resultOne = if (r >= t) "R" else "T"
        val resultTwo = if (c >= f) "C" else "F"
        val resultThree = if (j >= m) "J" else "M"
        val resultFour = if (a >= n) "A" else "N"

        return resultOne + resultTwo + resultThree + resultFour
    }
}
