import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

/**
 * Tests for Task 1514
 */
class TestTask1514 {
    private fun generateMatrixString(matrix: Array<IntArray>): String {
        return matrix.joinToString("\n") { row ->
            row.joinToString(" ")
        }
    }

    @Test
    fun testExample1() {
        // Input data
        val snakeMatrix = SnakeMatrix(4, 6)

        // Expected output
        val expected = """
            21 20 13 12 5 4
            22 19 14 11 6 3
            23 18 15 10 7 2
            24 17 16 9 8 1
        """.trimIndent()

        // Check the result
        assertEquals(expected, generateMatrixString(snakeMatrix.filledMatrix))
    }

    @Test
    fun testExample2() {
        // Input data
        val snakeMatrix = SnakeMatrix(7, 5)

        // Expected output
        val expected = """
            35 22 21 8 7
            34 23 20 9 6
            33 24 19 10 5
            32 25 18 11 4
            31 26 17 12 3
            30 27 16 13 2
            29 28 15 14 1
        """.trimIndent()

        // Check the result
        assertEquals(expected, generateMatrixString(snakeMatrix.filledMatrix))
    }
}