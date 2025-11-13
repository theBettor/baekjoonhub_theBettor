class Solution {
    fun solution(num_list: IntArray): IntArray {
        // 빈 배열로 시작
        var answer = num_list.copyOf()  // num_list 내용을 그대로 복사
        
        val last = num_list.last()
        val prev = num_list[num_list.size - 2]
        
        // 조건에 따라 새 원소 추가
        if (last > prev) {
            answer += (last - prev)
        } else {
            answer += (last * 2)
        }

        return answer
    }
}