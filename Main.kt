fun main() {
    var c1 = Cat()
    var c2 = Cat(name="하늘")
    var c3 = Cat(5,"나비")
    println("-----------------------")

    c2?.run {
        helloToOther(c1)
        helloToOther(c2)
        helloToOther(c3)
    }
}