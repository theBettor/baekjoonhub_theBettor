class Solution {
    fun solution(number: String): Int =
        number.sumOf { it.toString().toInt() } % 9
}

// sumOf는 리스트나 시퀀스 같은 컬렉션에 대해, 각 요소를 가공해서 그 결과를 모두 더하는 함수이다.
// 가공은 람다식으로 전달되며, 람다식 안에서 각 요소를 자동으로 it이라는 이름으로 받아 처리할 수 있다.
// it : 람다식에 매개변수 1개만 있을 때 자동으로 생기는 기본 이름

// number는 String이니까 굳이 비유하라면 문자의 리스트(CharSequence)다.
// sumOf는 그 문자들 각각에 대해 람다식을 적용하고 더한다. it은 각 문자를 나타낸다.
// number는 본래 String이지만, sumOf 안에서 순회되는 it은 Char 타입이므로, 숫자로 변환하려고 바로 toInt()를 쓰면 아스키 코드 값을 반환하게 된다. 따라서 문자 하나를 문자열로 변환한 뒤(toString()), 그것을 정수로 바꾸기 위해 toInt()를 연이어 사용하는 방식이 필요하다.