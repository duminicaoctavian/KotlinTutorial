fun main(args: Array<String>) {
    println("Hello World")
    println("My first Kotlin program")

    var tim: String
    tim = "Tim Buchalka"
    println(tim)

    var timsWeeklySalary: Int = 32
    var timsMonthlySalary: Int = timsWeeklySalary * 4
    println("Tim's $ weekly salary is $$timsWeeklySalary")
    println("Tim's monthly salary is $timsMonthlySalary")

    val apples: Int = 6
    val oranges: Int = 5
    var fruit: Int = apples - oranges
    println("$apples apples - $oranges oranges leaves $fruit piece(s)")

    println("A quarter of the apples is ${apples / 4}")

    val weeks: Int = 234
    val years: Double = weeks / 52.0
    println(years)
    println("$weeks weeks is $years in years")

    println("My name is $tim")
    println("I can print \$tim")
}