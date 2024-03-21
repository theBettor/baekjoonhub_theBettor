class Solution {
    fun solution(my_string: String, n: Int) = my_string.substring(my_string.length-n)
    // 주어진 시작 인덱스부터 끝 인덱스 이전까지의 부분 문자열을 반환한다 (끝 인덱스는 포함되지 않는다)
    // 서브 스트링을 할건데 예를들어 
    // "He110W0r1d", 5
    // 기댓값 〉"W0r1d"
    // length가 10이니까 10-5하면 5임. substring5를 하면 0부터 5까지의 인덱스 값을 얘기하는걸테고 마지막 인덱스는 포함 안되니까
    // 6글자의 문자열이아니라 5글자가 출력되겠다.
}