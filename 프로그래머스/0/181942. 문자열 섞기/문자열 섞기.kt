class Solution {
    fun solution(str1: String, str2: String): String {
        var answer: String = ""
        for (i in 0 until str1.length) { 
            // “모든 문자 위치를 순서대로 훑기”
            answer += str1[i]
            answer += str2[i]
        }
        return answer
    }
}