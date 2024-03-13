class Solution {
    fun solution(num_list: IntArray): Int {
        var result: Int = 0
        if (num_list.size >= 11) {
            return num_list.sum()
        } else { 
            return num_list.reduce { acc, v -> acc * v }
        }
        return result
    }
}