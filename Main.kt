fun test(str: String?){
    val the_str = str ?: "unknown"
    println(the_str)
}

fun main() {
    test("Hello")
    test(null)
}