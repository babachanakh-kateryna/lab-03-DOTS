import org.example.SumBetweenMinMax
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

/**
 * Tests for Task 1335
 */
class TestTask1335 {
    @Test
    fun testExample1() {
        // Input data
        val array = listOf(2, 1, 1, 3, 3)

        // Expected output
        val expectedSum = 8

        // Run the class for Task 1335
        val sumCalculator = SumBetweenMinMax(array)

        // Check the result
        assertEquals(expectedSum, sumCalculator.sum)
    }

    @Test
    fun testExample2() {
        // Input data
        val array = listOf(2, 3, -1)

        // Expected output
        val expectedSum = 2

        // Run the class for Task 1335
        val sumCalculator = SumBetweenMinMax(array)

        // Check the result
        assertEquals(expectedSum, sumCalculator.sum)
    }
}