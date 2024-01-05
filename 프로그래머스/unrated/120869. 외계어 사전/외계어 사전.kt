class Solution {
    fun solution(spell: Array<String>, dic: Array<String>): Int {
        for (i in dic.indices) {
          if (spell.all { dic[i].contains(it) }) {
              return 1
          }
        }
        return 2
    }
}