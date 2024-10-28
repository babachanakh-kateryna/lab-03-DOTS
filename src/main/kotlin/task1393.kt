/**
 * Class with the solution to problem 1393
 * @property array List<Int> The array to be sorted
 */
class CustomSorter(private val array: List<Int>) {
    val sortedArray: List<Int> = sortArray()

    private fun sortArray(): List<Int> {
        return array.sortedWith { a, b ->
            when {
                // rule 1: Place even numbers after odd numbers
                a % 2 == 0 && b % 2 != 0 -> 1
                a % 2 != 0 && b % 2 == 0 -> -1

                // rule 2: Both numbers are even, sort asc
                a % 2 == 0 && b % 2 == 0 -> a - b

                // rule 3: Both numbers are odd, sort desc
                a % 2 != 0 && b % 2 != 0 -> b - a

                else -> 0
            }
        }
    }
}

/**
 * Main program
 */
fun main() {
    val result = try {
        val n = readLine()!!.toInt()
        val inputArray = readLine()!!.split(" ").map { it.toInt() }

        CustomSorter(inputArray).sortedArray.joinToString(" ")
    } catch (e: Exception) {
        "Error: ${e.message}"
    }

    //result
    println(result)
}
