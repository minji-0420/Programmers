class Solution {
    fun solution(arr: IntArray, query: IntArray): IntArray {
    var answer = arr.copyOf()

    query.forEachIndexed { index, element ->
        answer = if (index % 2 == 0) {
            // 짝수 인덱스: 제외하고 뒷부분 자르기
            answer.sliceArray(0..element)
        } else {
            // 홀수 인덱스: 제외하고 앞부분 자르기
            answer.sliceArray(element until answer.size)
        }
    }

    return answer
}
}