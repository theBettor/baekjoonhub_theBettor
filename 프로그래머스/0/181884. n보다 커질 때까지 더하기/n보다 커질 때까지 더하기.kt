class Solution {
    fun solution(numbers: IntArray, n: Int): Int {
        var answer: Int = 0
        var index = 0 // 정수 배열 접근을 위함
        while(answer <= n){ // 2. 그 합이 n보다 커지는 순간
            answer += numbers[index] // 1. numbers의 0번째 원소부터 하나씩 더하다가
            index++ // 1-1. 0번째, 1번째, 2번째로 넘어가기 위함.
        }
        return answer // 3. 이때까지 더했던 원소들의 합을 return
    }
}

// 커지는 순간이 answer <= n 을 쓰고 있는데
// 같거나 커지는 순간도 가능한 표현인가??