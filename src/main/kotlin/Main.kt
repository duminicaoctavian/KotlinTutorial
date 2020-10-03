fun main() {
    println("Hello World")
    println("My first Kotlin program")

    val jim = "James T Kirk"
    val tim = "Tim Buchalka"
    println(tim)

    val timsWeeklySalary = 32
    val timsMonthlySalary = timsWeeklySalary * 4
    println("Tim's $ weekly salary is $$timsWeeklySalary")
    println("Tim's monthly salary is $timsMonthlySalary")

    val apples = 6
    val oranges = 5
    val fruit = apples - oranges
    println("$apples apples - $oranges oranges leaves $fruit piece(s)")

    println("A quarter of the apples is ${apples / 4}")

    val weeks = 234
    val years = weeks / 52.0
    println(years)
    println("$weeks weeks is $years in years")

    println("My name is $tim")
    println("I can print \$tim")
    println("jim is $jim")

    val lives = 0

    var isGameOver = (lives < 1)
    println(isGameOver)

    if (isGameOver) {
        println("Game over!")
    } else {
        println("You're still alive!")
    }

    println("How old are you: ")
    val age = readLine()!!.toInt()
    println("Age is $age")

    var message: String

    message = when {
        age < 18 -> {
            "You're too young to vote"
        }
        age == 100 -> {
            "Congratulations"
        }
        else -> {
            "You can vote"
        }
    }

//    message = if (age < 18) {
//        "You're too young to vote"
//    } else if (age == 100) {
//        "Congratulations"
//    } else {
//        "You can vote"
//    }

    println(message)
}