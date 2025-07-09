class Solution {
    fun solution(my_string: String): Array<String> = 
        my_string.indices
            .map { i -> my_string.substring(i) }
            .sorted()
            .toTypedArray()
}
// indices는 문자열의 모든 인덱스를 순회할 수 있게 해주고, map은 각 인덱스 i를 기준으로 문자열의 i번째 문자부터 끝까지 자른 접미사로 변환하며, 이렇게 만들어진 접미사들을 알파벳순으로 정렬한 뒤 배열로 반환한다.