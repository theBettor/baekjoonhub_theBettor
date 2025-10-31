class Solution {
    fun solution(code: String): String {
        
        var mode = 0
        var ret = ""
        
        for (i in 0 until code.length) {
            if (mode == 0) {
                if (code[i] == '1') {
                    mode = 1
                } else if (code[i] != '1') {
                    if (i % 2 == 0) {
                        ret += code[i]
                    }
                }
            } else { // mode == 1
                if (code[i] == '1') {
                    mode = 0
                } else if (i % 2 == 1) {
                    ret += code[i]
                }
            }
        }
        // 모든 문자를 처리한 뒤, ret이 비어 있으면 "EMPTY" 반환
        return if (ret.isEmpty()) "EMPTY" else ret  
    }
}