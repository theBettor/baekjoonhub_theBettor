class Solution {
    fun solution(n: Int): Int = n.toString().toList().sumOf { it.digitToInt() }
}