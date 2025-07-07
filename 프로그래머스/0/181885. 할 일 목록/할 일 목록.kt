class Solution {
    fun solution(todo_list: Array<String>, finished: BooleanArray): Array<String> {
        var result = arrayOf<String>()
        todo_list.zip(finished.toTypedArray()) { todo, finished ->
            if (!finished) result += todo
        }
        return result
    }
    // return todo_list.filterIndexed {i, v -> finished[i].not()}.toTypedArray()

}

// 문자열 배열 결과를 담기 위한 result 변수를 만들고, zip으로 두 배열을 합치기 위해 BooleanArray를 toTypedArray()를 사용해 Array<Boolean>으로 변환한다. 이렇게 두 배열을 병합한 뒤, 각 요소 쌍 (todo, finished)를 람다식으로 순회하면서 finished가 false인 경우 result에 todo를 추가하는 방식으로 동작하며, zip은 결과를 반환하지 않기 때문에 함수의 최종 반환값인 result를 명시적으로 return 해준다.