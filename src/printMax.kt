fun main() {
    println(Long.MAX_VALUE)
    println(Int.MAX_VALUE)
    println(Short.MAX_VALUE)
    println(Byte.MAX_VALUE)

    println("99" + "" + "99")  // 1
    println("9"+4)             // 2
    println("" + 9999)         // 3
    println("9".repeat(4))     // 4

    val spell = "abra"
    println((spell + "cad").repeat(spell.length) + spell)
    println("\t")

    /*val shipA = readLine()!!
    val shipB = readLine()!!
    println(shipA[shipA.length - 1])
    println(shipB.last())

     */
//val num4 = readLine()!!.toInt()
  // val resulti =  (num4 > 0 && num4 < 10)
    //println(resulti)

}