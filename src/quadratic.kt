/**
 * There are numbers a, b, c, da,b,c,d. Output in ascending order all the integers between 0 and 1000 (inclusively),
 * which are the roots of the equation ax^3 + bx^2 + cx + d = 0

If a specified interval does not contain any roots of the equation, do not output anything.
 */

fun main() {
    /**
     * Read two integers a and b.
     * Print the sum of all the integers from a tob inclusive. It is guaranteed that a <b.
     */
    val a = readLine()!!.toInt()
    val b = readLine()!!.toInt()
    var sum = 0
    for (num in a..b) {
        sum += num
    }
    println(sum)

    /*
    val numList = 0..1000
    val (a, b, c, d) = MutableList(4) {
        readLine()!!.toInt()
    }

    for (x in numList){
        val formula = a * (x * x * x) + b * (x * x) + c * x + d
        if (formula == 0) {
            println(x)
        }
    }
     */
}
