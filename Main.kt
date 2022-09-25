fun main() {
    val fruits = arrayListOf(Fruit1.Apple(), Fruit1.Banana())
    val someFruit = when(fruits[0]){
        is Fruit1.Apple -> "Apple"
        is Fruit1.Banana -> "Banana"
    }
    println(someFruit)

    val fruits2 = arrayListOf(Apple(),Banana())
    val someFruit2 = when(fruits2[0]){
        is Apple -> "Apple"
        is Banana -> "Banana"
    }
    println(someFruit2)
}