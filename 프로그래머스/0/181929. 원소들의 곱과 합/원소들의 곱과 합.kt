import kotlin.math.pow

class Solution {
    fun solution(num_list: IntArray): Int {
        var answer: Int = 0
        val multiple = num_list.reduce { acc, v -> acc * v }
        var sum = num_list.sum()
        val sumPow = (sum.toDouble()).pow(2)
        if (multiple < sumPow) {
            return 1 
        } else if (multiple > sumPow) {
            return 0
        }
        return answer
    }
}