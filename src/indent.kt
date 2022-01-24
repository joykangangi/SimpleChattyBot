fun main() {
    val text = """
  {
    "firstName": "John",
    "lastName": "Smith",
    "age": 35,
    "phoneNumbers": [
        {
            "type": "mobile",
            "number": "123 567-7890"
        }
    ]
}
    """.trimIndent()
    print(text)

   println("1" + 2 + '3')
    println('1' + 2 + "3")
    println('1' + "2" + 3)
    println("1" + '2' + 3)

    val r = "Madam"
    r.reversed()
}
