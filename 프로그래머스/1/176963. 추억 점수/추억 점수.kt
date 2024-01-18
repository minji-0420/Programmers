class Solution {
    fun solution(name: Array<String>, yearning: IntArray, photo: Array<Array<String>>): IntArray {
        var answer = IntArray(photo.size)
        var result = HashMap<String, Int>()
        for (i in name.indices) {
            result[name[i]] = yearning[i]
        }
        for (j in photo.indices) {
            var total = 0
            for (person in photo[j]) {
                total += result.getOrDefault(person, 0)
            }
            answer[j] = total
        }
        return answer
    }
}