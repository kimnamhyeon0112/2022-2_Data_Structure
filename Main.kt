class Car {
    fun shape(str: String) {
        println("빨강")
    }

    fun num(int: Int) {
        println("2")
    }
}

fun Car.shape(str:String) {
    println("노랑")
}

fun Car.num(str:String) {
    println("3")
}

fun main() {
    Car().shape("A")
    Car().num(1)
    Car().num("B")
}