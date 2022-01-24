import java.util.*

fun main() {
    var i = 0
    while (i < 10) {
        i++
        if (i % 2 == 0) {
            print("$i ")
        }
    }
    /*
val c = listOf("one", "two","three").iterator()
    while (c.hasNext()){
        println(c.next())
    }

divide(40, 8)
}

fun divide(dividend: Int, divisor: Int) {
    val quotient = dividend / divisor
    println(quotient)
     */
    val a = readLine()!!.toInt()
    val b = readLine()!!.toInt()
    val c = readLine()!!.toInt()
    println(isRightEquation(a, b, c))

}

fun isRightEquation(num1: Int, num2: Int, num3: Int): Boolean {
    return num1 * num2 == num3
}