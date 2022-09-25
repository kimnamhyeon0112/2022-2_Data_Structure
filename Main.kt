fun main() {
    val output = Outer.Nested().greeting()
    println(output)

    val outer = Outer()
    println(outer.outside())

    Outer.Nested().accessCompanionMethod()
}