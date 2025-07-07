class Solution {
    fun solution(names: Array<String>): Array<String> {
        return names.toList().chunked(5) { it[0] }.toTypedArray() 
    }
}

// fun solution(names: Array<String>) = names.toList().chunked(5) { it[0] }

// chunked는 List 타입에서만 사용할 수 있는 함수로, 컬렉션을 지정한 크기(예: 5개)씩 잘라 작은 리스트들의 리스트로 나눈다.
// 뒤에 람다식 { it[0] }를 붙이면 각 묶음(리스트)의 첫 번째 요소만 추출하여, 그 결과가 새로운 리스트(List<String>)로 구성된다.
// 최종적으로 필요한 반환 타입이 Array<String>인 경우, toTypedArray()를 사용하여 List를 Array로 변환해준다.