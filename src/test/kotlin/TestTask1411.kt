import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import java.io.ByteArrayInputStream

/**
 * Tests for Task 1411
 */
class TestTask1411 {

    // system input
    private fun input(input: String) {
        System.setIn(ByteArrayInputStream(input.toByteArray()))
    }

    @Test
    fun testExample1() {
        // Input data
        input("A\n*\n3\n1\n1\nX\n5\n9\n7\n9\n#\n")

        // Expected output
        val expectedOutput = "9975311"

        // Run the class for Task 1411
        val maxNumberExtractor = MaxNumberExtractor()
        val result = maxNumberExtractor.maxNumber

        // Check the result
        assertEquals(expectedOutput, result)
    }

    @Test
    fun testExample2() {
        // Input data
        input("A\n0\nB\n#\n")

        // Expected output
        val expectedOutput = "0"

        // Run the class for Task 1411
        val maxNumberExtractor = MaxNumberExtractor()
        val result = maxNumberExtractor.maxNumber

        // Check the result
        assertEquals(expectedOutput, result)
    }
}