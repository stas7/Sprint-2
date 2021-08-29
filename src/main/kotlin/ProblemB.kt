class ProblemB {

    fun main() {

        var numberOfStrings = readInt()
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
}