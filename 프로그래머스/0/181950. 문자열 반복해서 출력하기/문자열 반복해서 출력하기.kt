fun main(args: Array<String>) {
	val input = readLine()!!.split(' ')
    val s1 = input[0]
    val a = input[1]!!.toInt()
    print(s1.repeat(a))
}