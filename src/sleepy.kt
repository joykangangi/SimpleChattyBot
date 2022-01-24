
fun main() {
    val normal = readLine()!!.toInt()
    val maximum = readLine()!!.toInt()
    val actual = readLine()!!.toInt()

  /*  if ( (actual <= maximum ) && (actual > normal) ) println("Normal")
    if  (actual > maximum && actual > normal) println("Excess")
    if  (actual <= normal && actual < maximum) println("Deficiency")

   */

    val sleepIsOkay = if (actual < normal) "Deficiency" else if (actual > maximum) "Excess" else "Normal"
    println(sleepIsOkay)
    
}