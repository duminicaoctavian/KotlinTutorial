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

    val isGameOver = (lives < 1)
    println(isGameOver)

    if (isGameOver) {
        println("Game over!")
    } else {
        println("You're still alive!")
    }

    println("How old are you: ")
    val age = readLine()!!.toInt()
    println("Age is $age")

    val message: String

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

    val message2 = if (age < 18) {
        "You're too young to vote"
    } else if (age == 100) {
        "Congratulations"
    } else {
        "You can vote"
    }

    println(message)
    println(message2)

    val player = Player("Tim")
    println(player.name)
    println(player.lives)
    println(player.level)
    println(player.score)

    player.show()

    val louise = Player("Louise")
    louise.level = 5
    louise.show()

    val louise2 = Player("Louise2", 5)
    louise2.show()

    val gr8 = Player("gr8", 4, 8)
    val one2watch = Player("Ace", 2, 5, 1000)
    gr8.show()
    one2watch.show()
    println(one2watch.weapon.name.toUpperCase())
    println(one2watch.weapon.damageInflicted)

    val axe = Weapon("Axe", 12)
    gr8.weapon = axe
    println(gr8.weapon.name)
    println(axe.name)

    axe.damageInflicted = 24
    println(axe.damageInflicted)
    println(gr8.weapon.damageInflicted)

    player.weapon = Weapon("Sword", 10)
    player.show()

    louise.weapon = player.weapon
    louise.show()

    player.weapon = Weapon("Spear", 14)
    player.show()
}