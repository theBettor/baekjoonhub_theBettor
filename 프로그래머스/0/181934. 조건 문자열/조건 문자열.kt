class Solution {
    fun solution(ineq: String, eq: String, n: Int, m: Int): Int {
        return if (
            (ineq == ">" && eq == "=" && n >= m) ||
            (ineq == ">" && eq == "!" && n > m) ||
            (ineq == "<" && eq == "=" && n <= m) ||
            (ineq == "<" && eq == "!" && n < m)
        ) 1 else 0
    }
}