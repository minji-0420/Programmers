class Solution {
    fun solution(array: IntArray, commands: Array<IntArray>): IntArray {

        var result = IntArray(commands.size)

        for (i in result.indices) {
            var arraySlice = array.slice(commands[i][0]-1.. commands[i][1]-1).sorted()

            result[i] = arraySlice[commands[i][2] - 1]
        }

        return result
    }
}