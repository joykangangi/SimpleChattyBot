/**Write a program that reads three integer numbers and prints true if the first number is between the second and the third ones (inclusive).
 *  Otherwise, it is to print false. The second number is always less than the third one. Use ranges to solve the problem.
 */

fun main() {
     //method 1
    /*println("Enter 3 integers separated by commas")
    val numbers = readLine()!!
  val nums = numbers.split(",").map { it.toInt() }
    val ans = if (nums[0] > nums[1] && nums[2] +1 > nums[0]) "true" else "false"
    println(ans)
     */

     //method 2
     val num1 = readLine()!!.toInt()
     val num2 = readLine()!!.toInt()
     val num3 = readLine()!!.toInt()
     val output = (num1 in num2 .. num3)
     println(output)
     println("*******")

     //method 3
     val a = getNum()
     println(a in getNum()..getNum())
     println("hello" in "he".."hi") // true
     println("abc" in "aab".."aac") // false
     println("wanjiku" in "wa".."x")

}
fun getNum(): Int {
    return readLine()!!.toInt()
}