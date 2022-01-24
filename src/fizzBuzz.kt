/**
 * Write a program that takes the input of two integers: the beginning and the end of the interval (both numbers belong to the interval).

The program is to output the numbers from this interval, but if the number is divisible by 3, you should output Fizz instead of it;
if the number is divisible by 5, output Buzz, and if it is divisible both by 3 and by 5, output FizzBuzz.

Output each number or word on a separate line.
 */
const val THREE = 3
const val FIVE = 5
fun main() {
    val input = readLine()!!.toInt()
    val input2 = readLine()!!.toInt()

    for (num in input..input2) {
        println(
            if (num % 3 == 0 && num % 5 == 0) "FizzBuzz"
            else if (num % 3 == 0) "Fizz"
            else if (num % 5 == 0) "Buzz"
            else num
        )
    }
    for (num in input..input2) {
        println(
            if (num % THREE == 0 && num % FIVE == 0) {
                "FizzBuzz"
            } else if (num % 3 == 0) {
                "Fizz"
            } else if (num % 5 == 0) {
                "Buzz"
            } else num
        )
    }
    
    println("********")
    println("********")
    for (num in input..input2) {
        println(
            when {
                num % THREE == 0 && num % FIVE == 0 -> "FizzBuzz"
                num % THREE == 0 -> "Fizz"
                num % FIVE == 0 -> "Buzz"
                else -> num
            }
        )
    }
}