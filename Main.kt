fun main() {
    var c1 = Cat()
    var c2 = Cat(name="하늘")
    var c3 = Cat(5,"나비")
    println("-----------------------")

    c2?.also {
        it.age = 10
        it.helloToOther(c1)
        it.helloToOther(null)
        it.helloToOther(c3)
    }?.talk()
}