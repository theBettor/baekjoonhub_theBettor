fun main(args: Array<String>) {
    val s1 = readLine()!!
    val result = s1.map {
        when {
            it.isUpperCase() -> it.lowercase()
            it.isLowerCase() -> it.uppercase()
            else -> it
        }
    }.joinToString("")
    println(result)
    
    // for(i in s1.indices){
    //     if(s1[i].isUpperCase()){
    //         print(s1[i].toLowerCase())
    //     }else{
    //         print(s1[i].toUpperCase())
    //     }
    // }
}

