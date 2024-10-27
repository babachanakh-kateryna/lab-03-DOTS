package org.example

/**
 * Class with the solution to problem 1302
 * @property array List<Int> The array to be repeated
 * @property k Int The number of times the array should be repeated
 */
class ArrayRepeater(private val array: List<Int>) {
    // Calculate k
    private val k: Int = array.first().let { kotlin.math.abs(it) }

    /**
     * Method to repeat the array k times
     */
    val repeatArray: List<String> = List(k) { array.joinToString(" ") }
}

/**
 * Main program
 */
fun main() {
    val result = try {
        val n = readLine()!!.toInt()
        val inputArray = readLine()!!.split(" ").map { it.toInt() }

        // check if the array size matches n
        if (n != inputArray.size) throw IllegalArgumentException("Array size doesn't match n")

        // Create an instance and get repeated output
        ArrayRepeater(inputArray).repeatArray
    } catch (e: Exception) {
        listOf("Error: ${e.message}")
    }

    // result
    result.forEach { println(it) }
}
