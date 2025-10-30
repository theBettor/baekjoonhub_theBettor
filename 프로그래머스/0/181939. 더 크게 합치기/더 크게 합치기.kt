class Solution {
    fun solution(a: Int, b: Int): Int {
        val sa = a.toString()
        val sb = b.toString()

        val ab = sa + sb
        val ba = sb + sa

        // ab와 ba 길이는 동일 => 문자열 비교로 크기 판단 가능
        // 문자열 비교가 실제 숫자 비교처럼 동작, 어이가 없네 이게 된다니..
        return if (ab >= ba) ab.toInt() else ba.toInt()
    }
}