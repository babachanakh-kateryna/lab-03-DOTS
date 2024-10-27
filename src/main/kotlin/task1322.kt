package org.example

import kotlin.math.absoluteValue

/**
 * Class with the solution to problem 1322
 * @property array List<Int> The array to be filtered
 * @property filteredElements List<Int> The elements with an even digit sum
 */
class EvenDigitSumFilter(private val array: List<Int>) {
    // lambda to calculate digit sum
    private val digitSum: (Int) -> Int = { num -> num.absoluteValue.toString().map { it.digitToInt() }.sum() }

    // filter the elements with an even digit sum
    val filteredElements: List<Int> = array.filter { digitSum(it) % 2 == 0 }
}


/**
 * Main program
 */
fun main() {
    val result = try {
        val n = readLine()!!.toInt()
        val inputArray = readLine()!!.split(" ").map { it.toInt() }

        // check if the array size matches n
        if (n != inputArray.size) throw IllegalArgumentException("Array size does not match n")

        // Create an instance and get filtered output
        val filter = EvenDigitSumFilter(inputArray)
        val count = filter.filteredElements.size
        val output = if (count > 0) filter.filteredElements.joinToString(" ") else null
        "$count\n${output ?: ""}".trim()
    } catch (e: Exception) {
        "Error: ${e.message}"
    }
    // result
    println(result)
}
