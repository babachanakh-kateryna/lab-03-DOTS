import org.example.EvenDigitSumFilter
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

/**
 * Tests for Task 1322.
 */
class TestTask1322 {
    @Test
    fun testExample1() {
        // Input data
        val array = listOf(1, 10, -12, 404, 5030, 10000, -321)

        // Run the class for Task 1322
        val filter = EvenDigitSumFilter(array)

        // Expected output
        val expectedOutput = listOf(404, 5030, -321)

        // Check the result
        assertEquals(expectedOutput, filter.filteredElements)
    }

    @Test
    fun testExample2() {
        // Input data
        val array = listOf(11, 0, 1, 10, -20, -30900, -300, 3010)

        // Run the class for Task 1322
        val filter = EvenDigitSumFilter(array)

        // Expected output
        val expectedOutput = listOf(11, 0, -20, -30900, 3010)

        // Check the result
        assertEquals(expectedOutput, filter.filteredElements)
    }

}