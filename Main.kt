fun main() {
    val arr1 = arrayListOf(1, 12, 3, 4)
    val arr2 = arrayListOf(1, 6, 8, 7)
    val h1 = MinHeap<Int>()
    val h2 = MaxHeap<Int>()
    h1.heapify(arr1)
    h2.heapify(arr2)
    h1.merge(h2)
    while (!h1.isEmpty)
        println(h1.remove())
}