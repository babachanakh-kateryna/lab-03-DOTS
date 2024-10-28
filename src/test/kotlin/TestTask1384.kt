import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

/**
 * Tests for Task 1384
 */
class TestTask1384 {
    @Test
    fun testExample1() {
        // Input data
        val array = listOf(3, 3, 4, 1, 5, -3, -2, -2, 4, -2)
        val k = 5

        // Expected output
        val expectedSumOfSmallest = -8
        val expectedSumOfLargest = 19

        // Run the class for Task 1384
        val sumOfExtremes = SumOfExtremes(array, k)

        // Check the result
        assertEquals(expectedSumOfSmallest, sumOfExtremes.sumOfSmallest, "Sum of smallest elements is incorrect")
        assertEquals(expectedSumOfLargest, sumOfExtremes.sumOfLargest, "Sum of largest elements is incorrect")
    }

    @Test
    fun testExample2() {
        // Input data
        val array = listOf(9, 2, 8, 3, 9, 7, 7, 6, 8, 2)
        val k = 8

        // Expected values
        val expectedSumOfSmallest = 43
        val expectedSumOfLargest = 57

        // Run the class for Task 1384
        val sumOfExtremes = SumOfExtremes(array, k)

        // Check the result
        assertEquals(expectedSumOfSmallest, sumOfExtremes.sumOfSmallest, "Sum of smallest elements is incorrect")
        assertEquals(expectedSumOfLargest, sumOfExtremes.sumOfLargest, "Sum of largest elements is incorrect")
    }
}