class Solution {
    fun solution(numbers: IntArray): IntArray {
        var answer: IntArray = intArrayOf()
        answer = numbers.map { it * 2 }.toIntArray() 
        // numbers.map { it * 2 }는 IntArray를 List<Int>로 변환하고 각 요소에 2를 곱한 새로운 리스트를 반환합니다.
        // List<Int>를 IntArray로 변환하기 위해 toIntArray()를 사용해야 합니다.
        return answer
        // return에는 = 를 사용할 수 없다. 
        // return은 함수에서 값을 반환할 때 사용하는 키워드이고, answer = ...는 변수에 값을 할당하는 코드입니다. 
    }
}