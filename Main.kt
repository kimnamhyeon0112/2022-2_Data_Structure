class Main
{
}

fun main() {
    var tc = Man("Kevin", 23, "Student")
    println(tc.age)
    println(tc.job)
    println(tc.address)
    println(tc.strength)

    tc.address = "Earth"
    println(tc.address)

    tc.cursed = true
    println(tc.speed)
}