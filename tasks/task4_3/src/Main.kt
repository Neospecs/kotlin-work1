// Task 4.3: grade calculation using a when expression
import kotlin.math.roundToInt

fun main() {
    print("Enter your three scores from 0 to 100:")
    val score1 = readln().toDouble()
    val score2 = readln().toDouble()
    val score3 = readln().toDouble()

    if (score1 !in 0.0..100.0 || score2 !in 0.0..100.0 || score3 !in 0.0..100.0) {
        println("Invalid score entered.")
        return
    }

    
    val averageScore = (score1 + score2 + score3) / 3
    val rounded = averageScore.roundToInt()
    val grade = when (averageScore) {
        in 0.0..39.9 -> "Fail"
        in 40.0..69.9 -> "Pass"
        in 70.0..100.0 -> "Distinction"
        else -> "Invalid score"
    }
    println("Your grade is: $grade")
    println("Your average score is: $averageScore")
    println("Your rounded average score is: $rounded")

}

