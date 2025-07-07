class Solution {
    fun solution(arr: IntArray): IntArray = arr.map { num ->
        when {
            num >= 50 && num % 2 == 0 -> num / 2
            num < 50 && num % 2 != 0 -> num * 2
            else -> num
        }
    }.toIntArray()
    
    // 이 solution 함수는 
    // IntArray 타입의 arr를 받아, map을 사용해 각 요소 num에 대해 클로저(람다) 안에서 조건별 연산을 수행하며,     // map의 결과가 List<Int>이기 때문에 최종적으로 toIntArray()를 사용해 IntArray로 반환한다.
    // num은 map의 람다식에서 각 요소를 순차적으로 받아 처리하는 지역 변수이며,
    // 이 람다(익명 함수)는 클로저로 작동하여, 외부 상태 없이도 독립적으로 각 원소를 조건에 따라 변환한다.
}