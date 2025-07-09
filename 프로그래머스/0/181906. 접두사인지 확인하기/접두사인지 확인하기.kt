class Solution {
    fun solution(my_string: String, is_prefix: String): Int =
        if (my_string.startsWith(is_prefix)) 1 else 0
    // endsWith도 있다. 
}