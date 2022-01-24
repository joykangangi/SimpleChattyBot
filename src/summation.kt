import java.util.stream.IntStream.range

fun main() {
    /**
     * The first line contains the number N.
    The other lines contain N numbers.
    Output the sum of N numbers.
     */
    /* val input = readLine()!!.toInt()
    var sum = 0
   //repeat()
    for (num in 1..input) {
     val numbers = readLine()!!.toInt()
        sum += numbers
    }
    println(sum)
    */
    //Write a program that reads a, b, n and outputs the amount of numbers divisible by n in the range from a to b (a < b) inclusively.
    val a = readLine()!!.toInt()
    val b = readLine()!!.toInt()
    val n = readLine()!!.toInt()

    var count = 0
    for (num in a..b) {
        if (num % n == 0) count++
    }
    println(count)
    println("********")

    println((a..b).filter { it % n == 0 }.size)

}

 /*   val(aa, bb, nn) = Array(3){
        readLine()!!.toInt()
    }

  */



