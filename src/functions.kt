import java.util.*
import kotlin.system.measureTimeMillis

/*import kotlin.system.measureTimeMillis

fun getSum(a:Int, b:Int, c:Int)=a+b+c

fun main()
{
    val a=9; val b=8 ;val c=9
  println("The sum is ${getSum(a,b,c)}")
val time= measureTimeMillis {
    for (i in 1..1000){
        println(i)
    }
}
    println("It took $time milliseconds")
}
fun printIt(arg:Any){
    if (arg is String) {
        println("The length ${arg.length}")
    }
    println(arg)
}
fun main(){
    printIt("Kangangi is awesome")
    printIt(42)
}

fun main() {
    val(a,b)= readLine()!!.split("").map (String::toInt)
     println("The difference is ${if (a>=b)a-b else b-a}")
}
fun main(){
    println("Enter 3 Intergers")
    val b:Int= readLine()!!.toInt()
    val c:Int= readLine()!!.toInt()
    val a:Int= readLine()!!.toInt()
    println(" $a+$b+$c=${a+b+c}")

    println("Enter any 2 numbers")
    val x:Float= readLine()!!.toFloat()
    val y:Float= readLine()!!.toFloat()
    println("$x-$y=${x-y}")
}
val month ="(JAN|FEB|MAR|APR|MAY|JUN|JUL|AUG|SEP|OCT|NOV|DEC)"
fun getPattern():String="""\d{2}.\{month}\.\d{4}"""//raw string
fun main() {
    val (a, b, c) = readLine()!!.split("").map(String::toInt)
    println(" $a+$b+$c = ${a + b + c}")

    println(15.00/7.00)
}*/
fun main() {
   // val string ="PL Coding".toUpperCase()
   // println(string.reversed().toLowerCase().toUpperCase())
    println("Type a word:")
    val word: String = readLine()!!.toString()
    if (word.reversed() == word)
        println("$word is a palindrome")
    else println("$word is NOT a palindrome")

    val myOn = Another()
    myOn.str = "Joy"
    val input = readLine()!!.toString()
    val chars = input.toCharArray()
    for (c in chars) {
        print(input)
    }
    val reader = Scanner(System.`in`)
    val input2:Double = reader.nextDouble()
    val intToLong = input2.toLong()
    println(intToLong)
}

class Another() {
    var str: String = ""
}