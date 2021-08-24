class ProblemA {

    fun main() {
        val numberOfIterations = getNumberOfIterations()
        val listOfHops = ArrayList<IntArray>()
        for (counter in 1..numberOfIterations) {
            listOfHops.add(getHopDetails())
        }
        for (hop in listOfHops) {
            var currentPosition: Long = 0
            for (counter in 1..hop[2]) {
                currentPosition = makeHop(counter, currentPosition, hop)
            }
            println(currentPosition)
        }

    }

    fun getNumberOfIterations(): Int {
        var numberOfIterations: Int
        do {
            // тут бы вывод в консоль что ожидается, но по условиям задачи быть не должно
            numberOfIterations = readInt()
        } while (numberOfIterations<1 || numberOfIterations > 1000)
        return numberOfIterations
    }

    fun getHopDetails(): IntArray {
        var hopDetail: IntArray
        do {
            // тут тоже неплохо б описание
            hopDetail = readIntArray(3)
        } while (hopDetail.any { it < 1 || it > 1000000000 })
        return hopDetail
    }

    fun makeHop (hopNumber: Int, currentPosition: Long, hopDetails: IntArray): Long {
        return if (hopNumber % 2 == 0) currentPosition - hopDetails[1].toLong() else currentPosition + hopDetails[0].toLong()
    }

}
