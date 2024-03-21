import java.util.PriorityQueue

class Solution {
    fun solution(operations: Array<String>): IntArray {
        
        val max = PriorityQueue<Int>(Comparator { a, b -> b.compareTo(a) })
        val min = PriorityQueue<Int>()
        
        for (op in operations) {
            val ops = op.split(" ")
            when (ops[0]) {
                "I" -> {
                    val num = ops[1].toInt()
                    max.offer(num)
                    min.offer(num)
                }
                "D" -> {
                    if (max.isNotEmpty()) {
                        if (ops[1] == "1") {
                            val maxNum = max.poll()
                            min.remove(maxNum)
                        } else {
                            val minNum = min.poll()
                            max.remove(minNum)
                        }
                    }
                }
            }
        }
        return if (max.isEmpty()) {
            intArrayOf(0, 0)
        } else {
            intArrayOf(max.poll(), min.poll())
        }
    }
}