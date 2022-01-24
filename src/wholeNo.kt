import kotlin.math.max

const val DIV = "2,3,5,6"
fun main() {

    /* val input = readLine()!!.toInt()
    val type = if (input < 0) "Negative" else if (input > 0) "Positive" else "Zero"
    println(type)

    val input1 = readLine()!!.toInt()
  val ans = if (input1 > 0 ) "Positive" else "Negative"
    *///2 3 5 6

    /*
    val factors = DIV.split(",").map { it.toInt() }
    val input = readLine()!!.toInt()
    for (e in factors) {
      if (input % e == 0) println("Divided by $e")
        //println(if (true) if (false) { "A" } else "B")
    }
    */

   /* val a = readLine()!!.toInt()
    val b = readLine()!!.toInt()
    //val max = if (a > b) a else b
    if (a > b) println(a)
    if (b > a) println(b)
    println("******")
   println(max(a, b))
    */

    val maString = readLine()!!
    repeat(10){
        println(maString)
    }
}