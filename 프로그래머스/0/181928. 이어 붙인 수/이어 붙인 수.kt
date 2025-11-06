class Solution {
    fun solution(num_list: IntArray): Int {
        var oddStr = ""   
        var evenStr = ""  

        for (n in num_list) {
            if (n % 2 == 0) {        
                evenStr += n.toString()
            } else {             
                oddStr += n.toString()
            }
        }

        val oddNum = oddStr.toInt()
        val evenNum = evenStr.toInt()

        return oddNum + evenNum
    }
}

