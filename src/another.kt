import kotlin.math.max

fun main() {
    /**
     * Write a program that reads N numbers and outputs the maximum pairwise product of
     * the given N numbers (the largest number that can be obtained by multiplying two different elements from the sequence).

    If there is only one input element, output this element.

    The first line of the input contains the number of elements N.
    The following lines contain N numbers, each on a separate line. All the numbers are positive.
     */

    val listSize = readLine()!!.toInt()
    val myList = mutableListOf<Int>()
    repeat(listSize) {
        myList.add(readLine()!!.toInt())
    }
    if (listSize == 1) println(myList[0]) else {
        myList.sortDescending()
        val maxProduct = myList[0] * myList[1]
        println(maxProduct)
    }
}
/*
    val count = readLine()!!.toInt()
    val num = MutableList(count) { readLine()!!.toInt() }
    val prod = num.sortedDescending()
    if (count == 1) println(prod[0]) else println(prod[0] * prod[1])
 */

