fun main() {
    var a = 10.downTo(1)
    a.forEach {
        if (it % 2 == 0) println(it)
    }
    println("---------------------------")

    var c = 1 until 10
    var d = c.filter {
        it % 2 == 1
    }
    println(d)
    println("---------------------------")

    var e = ('a'..'c').toList() + a.toList() + d
    println(e)
}