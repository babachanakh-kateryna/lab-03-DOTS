/**
 * Class with the solution to problem 1507
 * @property matrix List<List<Int>> The matrix data
 */
class MatrixExtractor(n: Int, m: Int, private val matrix: List<List<Int>>, columnsToExtract: List<Int>) {
    private val selectedColumns = columnsToExtract.map { it - 1 }

    //  get the extracted columns
    val extractedColumns: List<String> by lazy {
        matrix.map { row ->
            selectedColumns.joinToString(" ") { col -> row[col].toString() }
        }
    }
}

/**
 * Main program
 */
fun main() {
    // dimensions
    val (n, m) = readLine()!!.split(" ").map { it.toInt() }

    //matrix
    val matrix = List(n) { readLine()!!.split(" ").map { it.toInt() } }

    //columns to extract
    val k = readLine()!!.toInt()
    val columnsToExtract = readLine()!!.split(" ").map { it.toInt() }

    val result = try {
        MatrixExtractor(n, m, matrix, columnsToExtract).extractedColumns
    } catch (e: Exception) {
        listOf("Error: ${e.message}")
    }

    //result
    result.forEach { println(it) }
}