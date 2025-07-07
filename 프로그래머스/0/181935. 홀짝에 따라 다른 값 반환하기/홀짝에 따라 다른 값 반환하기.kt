class Solution {
    fun solution(n: Int): Int = 
        if(n % 2 == 0) {
            (n downTo 1 step 2).sumOf { it * it }
        } else {
            (n downTo 1 step 2).sum()
        }
        
//         val nums = listOf(2, 4, 6)

// nums.sum()               // 12 (2 + 4 + 6)
// nums.sumOf { it * it }   // 56 (4 + 16 + 36)
}