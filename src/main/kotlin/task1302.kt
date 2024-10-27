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
    fun repeatArray(): List<String> {
        return List(k) { array.joinToString(" ") }
    }
}

/**
 * Main program
 */
fun main() {
    val n = readLine()!!.toInt()
    val inputArray = readLine()!!.split(" ").map { it.toInt() }

    val arrayRepeater = ArrayRepeater(inputArray)
    arrayRepeater.repeatArray().forEach { println(it) }
}
