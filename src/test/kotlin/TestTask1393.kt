import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

/**
 * Tests for Task 1393
 */
class TestTask1393 {
    @Test
    fun testExample1() {
        // Input data
        val array = listOf(5, 4, 3, 2, 1)

        // Expected output
        val expectedOutput = listOf(5, 3, 1, 2, 4)

        // Run the class for Task 1393
        val sorter = CustomSorter(array)

        // Check the result
        assertEquals(expectedOutput, sorter.sortedArray)
    }

    @Test
    fun testExample2() {
        // Input data
        val array = listOf(9, 2, 0, 7, -2, 5, 3, 1, -4)

        // Expected output
        val expectedOutput = listOf(9, 7, 5, 3, 1, -4, -2, 0, 2)

        // Run the class for Task 1393
        val sorter = CustomSorter(array)

        // Check the result
        assertEquals(expectedOutput, sorter.sortedArray)
    }
}