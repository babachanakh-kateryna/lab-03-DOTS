import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

/**
 * Tests for Task 1372
 */
class TestTask1372 {
    fun testExample1() {
        // Input data
        val array = mutableListOf(3, 2, 4, 1, 2, 4, 1, 3)

        // Expected output
        val expectedOutput = listOf(3, 1, 4, 2, 2, 3, 1, 4)

        // Run the class for Task 1372
        val sorter = OddIndexSorter(array)
        val sortedArray = sorter.sortOddIndexedElements()

        // Check the result
        assertEquals(expectedOutput, sortedArray)
    }

    @Test
    fun testExample2() {
        // Input data
        val array = mutableListOf(9, 8, 7, 6, 5, 4, 3, 2, 1)

        // Expected output
        val expectedOutput = listOf(9, 2, 7, 4, 5, 6, 3, 8, 1)

        // Run the class for Task 1372
        val sorter = OddIndexSorter(array)
        val sortedArray = sorter.sortOddIndexedElements()

        // Check the result
        assertEquals(expectedOutput, sortedArray)
    }
}