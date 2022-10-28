fun main() {
    val priorityQueue = MaxPriorityQueue<String>()

    arrayListOf("one", "two", "three", "four", "five", "six", "seven", "eight", "nine").forEach {
        priorityQueue.enqueue(it)
    }

    while (!priorityQueue.isEmpty) {
        println(priorityQueue.dequeue())
    }
}