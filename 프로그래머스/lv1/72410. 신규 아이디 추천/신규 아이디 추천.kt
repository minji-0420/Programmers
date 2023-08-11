class Solution {
    fun solution(new_id: String): String {
        var num1 = step1(new_id)
        var num2 = step2(num1)
        var num3 = step3(num2)
        var num4 = step4(num3)
        var num5 = step5(num4)
        var num6 = step6(num5)
        var num7 = step7(num6)
        return num7
    }

    fun step1(input: String): String {
        return input.lowercase()
    }

    fun step2(input: String): String {
        return input.replace("[^a-z0-9_.-]".toRegex(), "")
    }

    fun step3(input: String): String {
        return input.replace(Regex("\\.{2,}"), ".")
    }

    fun step4(input: String): String {
        return input.replace(Regex("^\\.|\\.$"), "")
    }

    fun step5(input: String): String {
        if (input.isEmpty()) {
            return "a"
        }
        return input
    }

    fun step6(input: String): String {
        if (input.length >= 16) {
            return input.substring(0, 15).removeSuffix(".")
        }
        return input
    }

    fun step7(input: String): String {
        var result = input
        while (result.length < 3) {
            result += result.last()
        }
        return result
    }
}