package search

fun main() {
    val input = readLine()!!.split(" ")
    val a = readLine()!!
    if (input.indexOf(a) >= 0) {
        println(input.indexOf(a) + 1)
    } else {
        println("Not found")
    }
}
