class Main
{
}

fun main()
{
    var o1: ChildOfInterface = ChildOfInterface(10)
    println(o1)
    println(o1.f1())
    println(o1.f2("A"))
    println(o1.f3("B"))
    println(o1.f4())
}