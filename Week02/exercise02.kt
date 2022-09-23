fun max(k: Int): Int
{
    var ret: Int = 0
    for (i in 1..k)
        if (i % 2 == 1) ret += i
    return ret
}

fun main()
{
    println(max(6))
}