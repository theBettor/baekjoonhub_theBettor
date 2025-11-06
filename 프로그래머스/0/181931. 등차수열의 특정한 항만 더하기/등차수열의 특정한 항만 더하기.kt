class Solution {
    fun solution(a: Int, d: Int, included: BooleanArray): Int {
        var sum = 0

        for (i in included.indices) {
            val term = a + d * i // i번째 인덱스는 실제로 "i+1번째 항"을 의미한다.

            if (included[i]) {
                sum += term
            }
        }
        return sum
    }
}