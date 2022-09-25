fun main() {
    var c1 = Cat()
    var c2 = Cat(name="하늘")
    var c3 = Cat(5,"나비")
    println("-----------------------")

    with(c2){
        helloToOther(c1)
        helloToOther(c3)
    }
}