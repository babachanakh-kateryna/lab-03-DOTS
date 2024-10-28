/**
 * Class with the solution to problem 1514
 * @property n Int The number of rows
 * @property m Int The number of columns
 */
class SnakeMatrix(private val n: Int, private val m: Int) {
    private val matrix = Array(n) { IntArray(m) }

    val filledMatrix: Array<IntArray> by lazy {
        fillMatrix()
        matrix
    }

    // fill the matrix
    private fun fillMatrix() {
        var num = 1
        for (col in m - 1 downTo 0) {
            if ((m - col) % 2 == 0) {
                // top to bottom
                for (row in 0 until n) {
                    matrix[row][col] = num++
                }
            } else {
                // bottom to top
                for (row in n - 1 downTo 0) {
                    matrix[row][col] = num++
                }
            }
        }
    }

    // print the matrix
    fun printMatrix() {
        filledMatrix.forEach { row ->
            println(row.joinToString(" "))
        }
    }
}

/**
 * Main program
 */
fun main() {
    try {
        val (n, m) = readLine()!!.split(" ").map { it.toInt() }
        SnakeMatrix(n, m).printMatrix()
    } catch (e: Exception) {
        println("Error: ${e.message}")
    }
}
