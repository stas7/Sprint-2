class ProblemA {

    fun main() {
        val listOfHops = ArrayList<IntArray>()
        for (counter in 1..readInt()) {
            listOfHops.add(readIntArray(3))
        }
        for (hop in listOfHops) {
            var currentPosition: Long = -(hop[2] / 2L) * hop[1] + (hop[2] / 2L) * hop[0]
            currentPosition += (if (hop[2] % 2 != 0) hop[0] else 0)
            println(currentPosition)
        }
    }
}
