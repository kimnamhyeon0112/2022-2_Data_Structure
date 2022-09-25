fun main()
{
    val list = LinkedList<Int>()
    list.push(3)
    list.push(2)
    list.push(1)
    println(list)

    var s: String = ""
    for (item in list)
        s += " -> ${item * 2}"
    s = s.substring(4)
    print(s)
}