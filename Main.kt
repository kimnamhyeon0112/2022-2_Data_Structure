fun main() {
    val list1 = listOf(1, 2, 3, 4, 5, 6, 7, 8)
    val list2 = listOf(1, 3, 4, 5, 5, 6, 7, 7)
    val result = merge(list1, list2)
    println("Merge sorted: $result")
}