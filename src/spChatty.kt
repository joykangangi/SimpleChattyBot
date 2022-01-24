const val botName = "Hello! My name is Adam."
const val botCreated = "I was created in 2021"
const val greetings = "Please, remind me your name."

 fun main() {
        println(botName)
        println(botCreated)
        println(greetings)
        yourName()
        agePrinter()
    }

    /** Delete all num */
    fun yourName() {
        /** 1. "try - catch" statement */
        return try {
            val nameIn = readLine()!!.toString()
            val textWithoutNum = nameIn.filter {
                !it.isDigit()
            }
            /** 2. If it is empty after deleting all num from readline */
            if (textWithoutNum.isEmpty()) {
                throw Exception()
            } else {
                println("What a great name you have, $textWithoutNum!")
            }
            /** 3. Exception */
        } catch (e: Exception) {
            println("Wrong input!")
            yourName()
        }
    }

    /** Predict the age of a user */
    fun agePrinter() {
        /** 1. Print 2 first lines */
        println("Let me guess your age.")
        println("Enter remainders of dividing your age by 3, 5 and 7.")
        /** 2. After that 3 - readiness in "try - catch" */
        return try {
            val ageIn1 = readLine()!!.toInt()
            val ageIn2 = readLine()!!.toInt()
            val ageIn3 = readLine()!!.toInt()
            /** 3. After that lambda, remind age */
            val remainder = { a: Int, b: Int, c: Int -> (a * 70 + b * 21 + c * 15) % 105 }
            /** 4. Checking errors by Exception */
            when {
                ageIn1 < 0 -> {
                    throw NumberFormatException()
                }
                ageIn2 < 0 -> {
                    throw NumberFormatException()
                }
                ageIn3 < 0 -> {
                    throw NumberFormatException()
                }
                else -> {
                    /** 5. Return result by lambda in println */
                    println("Your age is ${remainder(ageIn1, ageIn2, ageIn3)}; that's a good time to start programming!")
                }
            }
        } catch (e: NumberFormatException) {
            println("Wrong input!")
            agePrinter()
        }
    }