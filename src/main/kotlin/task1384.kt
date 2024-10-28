/**
 * Class with the solution to problem 1384
 * @property array List<Int> The array to calculate the sum of the k smallest and largest elements
 * @property k Int The number of elements to sum
 */
class SumOfExtremes(private val array: List<Int>, private val k: Int) {
    // sort array
    private val sortedArray = array.sorted()

    // calculate the sum of the k smallest elements
    val sumOfSmallest: Int = sortedArray.take(k).sum()

    // calculate the sum of the k largest elements
    val sumOfLargest: Int = sortedArray.takeLast(k).sum()
}

/**
 * Main program
 */
fun main() {
    val result = try {
        val n = readLine()!!.toInt()
        val inputArray = readLine()!!.split(" ").map { it.toInt() }
        val k = readLine()!!.toInt()

        SumOfExtremes(inputArray, k).let { "${it.sumOfSmallest} ${it.sumOfLargest}" }
    } catch (e: Exception) {
        "Error: ${e.message}"
    }

    // result
    println(result)
}
