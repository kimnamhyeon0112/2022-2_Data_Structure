fun f(k: Int): Int
{
//    k *=2       //k를 초기화하지 않았으므로 오류
    return k
}

fun main()
{
    var k: Int = 5
    var ret: Int = f(k)
    println("$k\t$ret")
}