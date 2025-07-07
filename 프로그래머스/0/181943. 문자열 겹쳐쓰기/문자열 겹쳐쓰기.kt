class Solution {
    fun solution(my_string: String, overwrite_string: String, s: Int): String
    = my_string.substring(0, s) + overwrite_string + my_string.substring(s + overwrite_string.length)
    // 인덱스 s부터 overwirte_string의 길이만큼을 overrite_string에 겹쳐쓰는 것이므로
    // substring으로 0부터 s까지 자르고 문자열 겹쳐서 이어주고, s부터 overwrite_string.length만큼도 붙혀준다.
}
