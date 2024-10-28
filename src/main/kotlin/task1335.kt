package org.example

/**
 * Class with the solution to problem 1335
 * @property array List<Int> The array to be filtered
 * @property sum Int The sum of elements between the min and max elements
 */
class SumBetweenMinMax(array: List<Int>) {
    // indices of min and max elements
    private val minIndex = array.indexOf(array.minOrNull() ?: 0)
    private val maxIndex = array.lastIndexOf(array.maxOrNull() ?: 0)

    // for correct range
    private val range = if (minIndex <= maxIndex) minIndex..maxIndex else maxIndex..minIndex

    // calculate the sum
    val sum: Int = array.slice(range).sum()
}


/**
 * Main program
 */
fun main() {
    val result = try {
        val n = readLine()!!.toInt()
        val inputArray = readLine()!!.split(" ").map { it.toInt() }

        // calculate sum
        SumBetweenMinMax(inputArray).sum
    } catch (e: Exception) {
        "Error: ${e.message}"
    }

    // result
    println(result)
}
