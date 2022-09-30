fun main() {
    var k1 = (1..6).toList()
    k1.forEach{
        if (it==2){return@forEach}
        println(it*10)
    }
    run{
        println("들어간다")
        k1.subList(0, 4).forEach{
            println(it)
            if(it%2==0)
                return@run
        }
        println("나왔다!")
    }
    println("끝났다!")
}