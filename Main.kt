fun main() {
    val list = arrayListOf(88, 410, 1772, 20)
    println("Original: $list")
    list.radixSort()
    println("Merge sorted: $list")
}