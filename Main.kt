import java.util.*

fun main() {
    val numVertex = readLine()!!.toInt()
    val numEdge = readLine()!!.toInt()
    val graph = Array(numVertex) { ArrayList<Int>() }

    fun addEdge(s: Int, t: Int) {
        graph[s].add(t)
        graph[t].add(s)
    }

    fun getConnected(s: Int, visited: ArrayList<Int>) {
        if (visited.contains(s))
            return
        visited.add(s)
        graph[s].forEach {
            getConnected(it, visited)
        }
    }

    repeat(numEdge) {
        val (src, tgt) = readLine()!!.split(" ").map { it.toInt() }
        addEdge(src - 1, tgt - 1)
    }

    val visited = ArrayList<Int>()
    getConnected(0, visited)
    println(visited.size - 1)
}