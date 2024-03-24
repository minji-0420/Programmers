class Solution {
    fun solution(n: Int, computers: Array<IntArray>): Int {
        var answer = 0
        val visited = BooleanArray(n)

        for (i in 0 until n) {
            if (!visited[i]) {
                dfs(computers, visited, i)
                answer ++
            }
        }
        return answer
    }

    fun dfs(computers: Array<IntArray>, visited: BooleanArray, start: Int) {
        visited[start] = true
        for (i in computers.indices) {
            if (computers[start][i] == 1 && !visited[i]) {
                dfs(computers, visited, i)
            }
        }
    }
}