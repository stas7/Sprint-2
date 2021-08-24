class ProblemD {

    fun main() {

        var numberOfIterations = readInt()
        val listOfCustomerPaymentCapability = ArrayList<LongArray>()
        while (numberOfIterations > 0) {
            val numberOfCustomers = readInt()
            listOfCustomerPaymentCapability.add(readLongArray(numberOfCustomers))
            numberOfIterations--
        }
        for (iteration in listOfCustomerPaymentCapability) {
            iteration.sortDescending()
            println(findMaxIncome(iteration))
        }
    }

    private fun findMaxIncome(customersMoney: LongArray): Long {
        customersMoney.sortDescending()
        var maxIncome = customersMoney[0]
        for ((index, value) in customersMoney.withIndex()) {
            if (value * (index + 1) >= maxIncome) maxIncome = (value * (index + 1)) else return maxIncome
        }
        return maxIncome
    }
}