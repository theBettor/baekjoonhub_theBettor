class Solution {
    fun solution(a: Int, b: Int, c: Int): Int {
        var score: Int = 0
        
        // else if문의 특징은 위의 조건이 참이면 아래는 건너뛴다는 뜻인데, 문제설명의 요구사항 순서대로 처리하면
        // “모두 같은 경우”인 (a == b && b == c)는 
        // “두 개만 같은 경우” 조건 (a == b || b == c || a == c)에도 포함돼기 때문에
        // 특수한 조건부터 검사해야한다.
        
        if (a == b && b == c) {
            score = (a + b + c) *
                    (a*a + b*b + c*c) *
                    (a*a*a + b*b*b + c*c*c)
        }
        // 2️⃣ 두 숫자만 같은 경우
        else if (a == b || b == c || a == c) {
            score = (a + b + c) * (a*a + b*b + c*c)
        }
        // 3️⃣ 모두 다른 경우
        else {
            score = a + b + c
        }
        return score
    }
}