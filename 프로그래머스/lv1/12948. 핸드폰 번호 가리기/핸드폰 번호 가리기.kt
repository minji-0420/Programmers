class Solution {
    fun solution(phone_number: String): String {
        
        var n = phone_number.length
        var replace = phone_number.substring(0, n-4).replace("[0-9]".toRegex(),"*")
        return replace + phone_number.substring(n-4)

    }
}