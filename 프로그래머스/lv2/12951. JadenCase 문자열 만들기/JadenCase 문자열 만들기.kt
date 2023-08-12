import java.util.Locale
class Solution {
    fun solution(s: String): String {
       return s.lowercase().split(" ").joinToString(" "){ it.capitalize(Locale.ROOT) }
    }
}