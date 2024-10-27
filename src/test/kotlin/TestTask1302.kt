import org.example.ArrayRepeater
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import java.io.*

/**
 * Tests for Task 1302
 */
class TestTask1302 {
    @Test
    fun testExample1() {
        // Input data
        val array = listOf(3, 3, 4, 1, 5)

        // Run the class for Task 1302
        val repeater = ArrayRepeater(array)

        // Expected output
        val expectedOutput = listOf(
            "3 3 4 1 5",
            "3 3 4 1 5",
            "3 3 4 1 5"
        )

        // Check the result
        assertEquals(expectedOutput, repeater.repeatArray())
    }

    @Test
    fun testExample2() {
        // Input data
        val array = listOf(-4, 4, -5, 5, 1, -6)

        // Run the class for Task 1302
        val repeater = ArrayRepeater(array)

        // Expected output
        val expectedOutput = listOf(
            "-4 4 -5 5 1 -6",
            "-4 4 -5 5 1 -6",
            "-4 4 -5 5 1 -6",
            "-4 4 -5 5 1 -6"
        )

        // Check the result
        assertEquals(expectedOutput, repeater.repeatArray())
    }
}