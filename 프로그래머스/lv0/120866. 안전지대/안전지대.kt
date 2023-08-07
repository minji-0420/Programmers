class Solution {
    // [0, 0, 0, 0, 0] [0][1] [0][2] [0][3] [0][4] [0][5]
    // [0, 0, 0, 0, 0] [1][1] [1][2] [1][3] [1][4] [1][5]
    // [0, 2, 2, 2, 2] [2][1] [2][2] [2][3] [2][4] [2][5]
    // [0, 2, 1, 1, 2] [3][1] [3][2] [3][3] [3][4] [3][5]
    // [0, 2, 2, 2, 2] [4][1] [4][2] [4][3] [4][4] [4][5]
    fun solution(board: Array<IntArray>): Int {
        val n = board.size
        val m = board[0].size

        val directions = arrayOf(-1, 0, 1)

        for (i in 0 until n) {
            for (j in 0 until m) {
                if (board[i][j] == 1) {
                    for (dx in directions) {
                        for (dy in directions) {
                            val nx = i + dx
                            val ny = j + dy
                            if (nx < 0 || nx >= n || ny < 0 || ny >= m) continue
                            if (board[nx][ny] == 1) continue
                            if (nx in 0 until n && ny in 0 until m && board[nx][ny] != 1) {
                                board[nx][ny] = 2
                            }
                        }
                    }
                }
            }
        }

        return board.sumOf { row -> row.count { it == 0 } }
    }
}