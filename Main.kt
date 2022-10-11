fun main(){
    var a = 1..10
    println(a.javaClass)
    println(a)

    var b = 1.rangeTo(10)
    println(b.javaClass)
    println(b)

    var c = 1 until 10
    println(c.javaClass)
    println(c)
}