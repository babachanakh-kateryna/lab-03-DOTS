import org.example.SemesterGrades
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

/**
 * Tests for Task 1353
 */
class TestTask1353 {
    @Test
    fun testExample1() {
        // Input data
        val gradeCounts = listOf(3, 4, 3)
        val allGrades = listOf(7, 8, 8, 9, 10, 10, 4, 12, 11, 12)

        // Expected output
        val expectedOutput = listOf(8, 8, 12)

        // Run the class for Task 1353
        val result = SemesterGrades(gradeCounts, allGrades).semesterGrades

        // Check the result
        assertEquals(expectedOutput, result)
    }

    @Test
    fun testExample2() {
        // Input data
        val gradeCounts = listOf(2, 5, 4, 4)
        val allGrades = listOf(3, 2, 12, 5, 3, 2, 3, 6, 11, 3, 11, 7, 6, 8, 5)

        // Expected output
        val expectedOutput = listOf(3, 5, 8, 7)

        // Run the class for Task 1353
        val result = SemesterGrades(gradeCounts, allGrades).semesterGrades

        // Check the result
        assertEquals(expectedOutput, result)
    }
}