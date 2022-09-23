fun checkFirst(names: List<String>)
{
    if (names.firstOrNull() != null)
        println(names.first())
    else
        println("no names")
}

fun main()
{
    var names: List<String> = listOf("Kevin", "Mila", "Sally")
    checkFirst(names)
}       //Big O = O(1)