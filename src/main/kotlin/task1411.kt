/**
 * Class with the solution to problem 1411
 */
class MaxNumberExtractor {
    val maxNumber: String by lazy { extractMaxNumber() }

    // extract the max number
    private fun extractMaxNumber(): String {
        val digits = generateSequence { readLine() }
            .takeWhile { it != "#" }
            .filter { it.length == 1 && it[0].isDigit() }
            .map { it[0] }
            .toList()

        return if (digits.isNotEmpty()) {
            digits.sortedDescending().joinToString("")
        } else {
            "0"
        }
    }
}

/**
 * Main program
 */
fun main() {
    val result = try {
        MaxNumberExtractor().maxNumber
    } catch (e: Exception) {
        "Error: ${e.message}"
    }

    // result
    println(result)
}
