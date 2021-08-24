import kotlin.math.abs

class ProblemC {

    fun main() {

        val numberOfStudents = readInt()
        var studentScores = readIntArray(numberOfStudents)
        studentScores.sort()
        var numberOfTasks = 0
        for (item in 0 until studentScores.size step 2) {
            numberOfTasks += abs(studentScores[item] - studentScores[item+1])
        }
        println(numberOfTasks)
    }
}