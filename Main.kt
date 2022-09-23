fun main()
{
    val list = LinkedList<Int>()
    var poppedValue = list.pop()
    println(poppedValue)

    list.append(10).append(30).append(20)

    println("Before popping list: $list")
    poppedValue = list.pop()
    println("After popping list: $list")
    println("Popped value: $poppedValue")
}