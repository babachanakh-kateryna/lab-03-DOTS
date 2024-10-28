import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

/**
 * Tests for Task 1507
 */
class TestTask1507 {

    @Test
    fun testExample1() {
        val matrix = listOf(
            listOf(5, 5, 4, 1, 8, 3),
            listOf(0, 0, 6, 2, 0, 8),
            listOf(4, 5, 2, 9, 8, 2),
            listOf(9, 8, 7, 4, 7, 8),
            listOf(3, 0, 5, 6, 4, 5)
        )
        val columnsToExtract = listOf(4, 2, 6)
        val expectedOutput = listOf("1 5 3", "2 0 8", "9 5 2", "4 8 8", "6 0 5")

        val extractor = MatrixExtractor(5, 6, matrix, columnsToExtract)
        assertEquals(expectedOutput, extractor.extractedColumns)
    }

    @Test
    fun testExample2() {
        val matrix = listOf(
            listOf(7, 1, 1, 6, 1),
            listOf(2, 7, 0, 1, 1),
            listOf(2, 7, 5, 6, 0),
            listOf(3, 0, 6, 3, 0),
            listOf(0, 9, 0, 9, 5),
            listOf(1, 5, 2, 1, 0),
            listOf(1, 8, 7, 2, 9)
        )
        val columnsToExtract = listOf(3, 2, 1, 2)
        val expectedOutput = listOf(
            "1 1 7 1",
            "0 7 2 7",
            "5 7 2 7",
            "6 0 3 0",
            "0 9 0 9",
            "2 5 1 5",
            "7 8 1 8"
        )

        val extractor = MatrixExtractor(7, 5, matrix, columnsToExtract)
        assertEquals(expectedOutput, extractor.extractedColumns)
    }

}