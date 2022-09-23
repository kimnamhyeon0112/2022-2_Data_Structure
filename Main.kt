class Main
{
}

fun main()
{
    var o1: TestDataClass = TestDataClass(1, "hi")
    var o2: TestDataClass = TestDataClass(1, "hi")
    o2.c = true

    println(o1.equals(o2))
    print((o2))
}