package search

fun main() {
    println("Enter the number of people:")
    val numPeople = readLine()!!.toInt()

    println("Enter all people:")
    val allPeople = Array(numPeople) { readLine()!! }

    println("Enter the number of search queries:")
    val numQueries = readLine()!!.toInt()

    repeat (numQueries) {
        println("Enter data to search people:")
        val query = readLine()!!

        val matches = allPeople.filter { it.contains(query, ignoreCase = true) }
        if (matches.isEmpty()) {
            println("No matching people found.")
        } else {
            matches.forEach { println(it) }
        }
    }
}
