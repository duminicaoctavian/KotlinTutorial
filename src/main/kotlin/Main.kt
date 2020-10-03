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

    val redPotion = Loot("Red Potion", LootType.POTION, 7.50)
    player.getLoot(redPotion)
    val chestArmor = Loot("+3 Chest Armor", LootType.ARMOR, 80.0)
    player.getLoot(chestArmor)
    player.showInventory()

    player.getLoot(Loot("Ring of Protection +2", LootType.RING, 40.25))
    player.getLoot(Loot("Invisibility Potion", LootType.POTION, 35.95))
    player.showInventory()

    if (player.dropLoot(redPotion)) {
        player.showInventory()
    } else {
        println("You don't have a ${redPotion.name}")
    }

    val bluePotion = Loot("Blue Potion", LootType.POTION, 6.00)
    if (player.dropLoot(bluePotion)) {
        player.showInventory()
    } else {
        println("You don't have ${bluePotion.name}")
    }

    if (player.dropLoot("Invisibility Potion")) {
        player.showInventory()
    } else {
        println("You don't have an Invisibility Potion")
    }

    for (i in 1..10) { // final value will be included
        println("$i squared is ${i * i}")
    }

    for (i in 0 until 10) { // final value won't be included
        println("$i squared is ${i * i}")
    }

    for (i in 10 downTo 0) {
        println("$i squared is ${i * i}")
    }

    for (i in 10 downTo 0 step 2) {
        println("$i squared is ${i * i}")
    }

    for (value in 3..100 step 3) {
        if (value % 5 == 0) {
            println(value)
        }
    }

    val enemy = Enemy("test enemy", 10, 3)
    println(enemy)

    enemy.takeDamage(4)
    println(enemy)

    enemy.takeDamage(11)
    println(enemy)

    val uglyTroll = Troll("Ugly Troll")
    println(uglyTroll)
    uglyTroll.takeDamage(30)
    println(uglyTroll)

    val vlad = Vampyre("Vlad")
    println(vlad)
    vlad.takeDamage(8)
    println(vlad)

    for (i in 1 .. 10) {

        val dracula = VampyreKing("Dracula")
        println(dracula)

        while (dracula.lives > 0) {

            if (dracula.dodges()) {
                continue
            }

            if (dracula.runAway()) {
                println("Dracula ran away")
                break
            } else {
                dracula.takeDamage(80)
            }
        }
        println("-----------------------------------------")
    }

    val conan = Player("Conan")
    conan.getLoot(Loot("Invisibility", LootType.POTION, 4.0))
    conan.getLoot(Loot("Mithril", LootType.ARMOR, 183.0))
    conan.getLoot(Loot("Ring of Speed", LootType.RING, 25.0))
    conan.getLoot(Loot("Red Potion", LootType.POTION, 2.0))
    conan.getLoot(Loot("Cursed Shield", LootType.ARMOR, -8.0))
    conan.getLoot(Loot("Brass Ring", LootType.RING, 1.0))
    conan.getLoot(Loot("Chain Mail", LootType.ARMOR, 4.0))
    conan.getLoot(Loot("Gold Ring", LootType.RING, 12.0))
    conan.getLoot(Loot("Health Potion", LootType.POTION, 3.0))
    conan.getLoot(Loot("Silver Ring", LootType.RING, 6.0))
    conan.showInventory()
}