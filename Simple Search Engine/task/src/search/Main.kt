package search

import java.io.File
import kotlin.system.exitProcess

fun main(args: Array<String>) {
    if (args.size != 2 || args[0] != "--data") {
        println("usage: <script> --data <filename>")
        exitProcess(1)
    }

    val filename = args[1]
    val allPeople = File(filename).readLines()

    do {
        printMenu()

        when (readLine()!!.toInt()) {
            0 -> break
            1 -> find(allPeople)
            2 -> print(allPeople)
            else -> println("Incorrect option! Try again.")
        }
    } while (true)

    println("Bye!")
}

fun printMenu() {
    println("=== Menu ===")
    println("1. Find a person")
    println("2. Print all people")
    println("0. Exit")
}

fun find(allPeople: List<String>) {
    println("Enter a name or email to search all suitable people.")
    val query = readLine()!!

    val matches = allPeople.filter { it.contains(query, ignoreCase = true) }
    if (matches.isEmpty()) {
        println("No matching people found.")
    } else {
        matches.forEach { println(it) }
    }
}

fun print(allPeople: List<String>) {
    println("=== List of people ===")
    allPeople.forEach { println(it) }
}