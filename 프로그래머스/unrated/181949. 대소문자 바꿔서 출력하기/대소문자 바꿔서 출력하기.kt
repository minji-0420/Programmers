fun main(args: Array<String>) {
    val s1 = readLine()!!
    println(s1.toList().map { if(it.isLowerCase()) it.toUpperCase() else it.toLowerCase() }.joinToString(""))
}