package org.example

import kotlin.math.roundToInt

/**
 * Class with the solution to problem 1353
 * @property gradeCounts List<Int> The number of grades for each subject
 * @property allGrades List<Int> All grades for all subjects
 */
class SemesterGrades(private val gradeCounts: List<Int>, private val allGrades: List<Int>) {
    // calculate semester grades
    val semesterGrades: List<Int> = gradeCounts.foldIndexed(mutableListOf()) { index, averages, count ->
        val subjectGrades = allGrades.drop(gradeCounts.take(index).sum()).take(count)
        averages.add(subjectGrades.average().roundToInt())
        averages
    }
}

/**
 * Main program
 */
fun main() {
    val result = try {
        val n = readLine()!!.toInt()
        val gradeCounts = readLine()!!.split(" ").map { it.toInt() }
        val allGrades = readLine()!!.split(" ").map { it.toInt() }

        // calculate semester grades
        SemesterGrades(gradeCounts, allGrades).semesterGrades.joinToString(" ")
    } catch (e: Exception) {
        "Error: ${e.message}"
    }

    // result
    println(result)
}
