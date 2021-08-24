
fun readln(): String {
    var input: String?
    do {
        input = readLine()
    } while (input.isNullOrEmpty())
    return input
}

fun readInt() = readln().toInt()
fun readLong() = readln().toLong()
fun readStrings() = readln().trim().split(" ")

fun readIntArray(size:Int) = readStrings().run { IntArray(size) { get(it).toInt() } }
fun readLongArray(size:Int) = readStrings().run { LongArray(size) { get(it).toLong() } }

fun readListInt() = readStrings().map { it.toInt() }
fun readListLong() = readStrings().map { it.toLong() }