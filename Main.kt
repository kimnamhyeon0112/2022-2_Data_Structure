fun main() {
    var s1 = Smartphone("A32")
    s1.Inner().which_cpu()
    Smartphone.Companion.which_cpu()
    val outer = Outer()
    Outer.Nested().accessCompanionMethod()
}