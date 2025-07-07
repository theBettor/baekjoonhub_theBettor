class Solution {
    fun solution(num_list: IntArray, n: Int): IntArray =
        (num_list.slice(n until num_list.size) + num_list.slice(0 until n)).toIntArray()
}
// slice()와 +는 List<Int>를 반환한다. + 연산도 배열끼리는 불가능하다.