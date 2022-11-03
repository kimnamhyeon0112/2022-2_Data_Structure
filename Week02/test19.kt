class Person1(
    private var age: Int,
    public var name: String="Noname",
)
{
}

fun main()
{
    var p1: Person1 = Person1(10)
    println(p1.name)
}