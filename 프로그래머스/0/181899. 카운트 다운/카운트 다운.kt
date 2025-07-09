class Solution {
    fun solution(start_num: Int, end_num: Int): IntArray = (end_num .. start_num).toList().reversed().toIntArray()
}
// Kotlin에서 .. 연산자는 기본적으로 오름차순만 지원, 
// (start_num downTo end_num).toList().toIntArray()