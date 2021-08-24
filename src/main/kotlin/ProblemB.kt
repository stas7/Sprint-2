class ProblemB {

    fun main() {

        var numberOfStrings = getNumberOfIterations()
        var listOfStringTemplates = ArrayList<IntArray>()
        while (numberOfStrings > 0) {
            listOfStringTemplates.add(readIntArray(2))
            numberOfStrings--
        }
        for (item in listOfStringTemplates) {
            for (counter in 0 until item[0]) {
                print((97 + counter % item[1]).toChar())
            }
            println()
        }
    }

    fun getNumberOfIterations(): Int {
        var numberOfIterations: Int
        do {
            // тут бы вывод в консоль что ожидается, но по условиям задачи быть не должно
            numberOfIterations = readInt()
        } while (numberOfIterations < 1 || numberOfIterations > 100)
        return numberOfIterations
    }
}