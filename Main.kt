fun f2(): ArrayList<Int> {
    return arrayListOf(10, 20)
}

fun f1(a: ArrayList<Int>?): Int {
    a!!.add(a.size)
    a.addAll(f2())
    return a.size
}

fun main(){
    val b = arrayListOf(5)
    println(f1(b))
    println(b)
    println(f1(null))
}