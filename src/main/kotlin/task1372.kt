/**
 * Class with the solution to problem 1372
 * @property array MutableList<Int> The array to be sorted
 */
class OddIndexSorter(private val array: MutableList<Int>) {

    // get the odd indexed elements
    private val oddIndexedElements: List<Int>
        get() = array.filterIndexed { index, _ -> index % 2 != 0 }.sorted()

    // method to sort the odd indexed elements
    fun sortOddIndexedElements(): List<Int> {
        var oddIndex = 0
        return array.mapIndexed { index, value ->
            if (index % 2 != 0) {
                oddIndexedElements[oddIndex++]
            } else {
                value
            }
        }
    }
}

/**
 * Main program
 */
fun main() {
    try {
        val n = readLine()!!.toInt()
        val array = readLine()!!.split(" ").map { it.toInt() }.toMutableList()

        val sorter = OddIndexSorter(array)
        println(sorter.sortOddIndexedElements().joinToString(" "))
    } catch (e: Exception) {
        println("Error: ${e.message}")
    }
}
