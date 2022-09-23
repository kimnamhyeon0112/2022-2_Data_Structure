class Main {

}

fun main()
{
    var o1: TestDataClass = TestDataClass(3)
    var o2: TestDataClass = TestDataClass(5, "hello")
    val o3: TestDataClass = o2.copy()

    val eq: Boolean = o1.equals(o2)
    println(eq)
    println(o2.equals(o3))

    var (a, b) = o1
    println("$a\t$b")
    println(o1)
}