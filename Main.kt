fun main() {
    var a = 1..10 step 2
    var b = 10 downTo 1 step 3
    var c = (1..5).reversed() step 2
    println(a.toList())
    println(b.toList())
    println(c.toList())
}