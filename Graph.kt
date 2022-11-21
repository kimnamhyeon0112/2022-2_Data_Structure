interface Graph<T> {
    fun createVertex(data: T): Vertex<T>
    fun addDirectedEdge(
        source: Vertex<T>,
        destination: Vertex<T>,
        weight: Double?
    )

    fun addUndirectedEdge(
        source: Vertex<T>,
        destination: Vertex<T>,
        weight: Double?
    ) {
        addDirectedEdge(source, destination, weight)
        addDirectedEdge(destination, source, weight)
    }

    fun add(
        edge: EdgeType,
        source: Vertex<T>,
        destination: Vertex<T>,
        weight: Double?
    ) {
        when (edge) {
            EdgeType.DIRECTED -> addDirectedEdge(source, destination, weight)
            EdgeType.UNDIRECTED -> addUndirectedEdge(source, destination, weight)
        }
    }

    fun edges(source: Vertex<T>): ArrayList<Edge<T>>
    fun weight(source: Vertex<T>, destination: Vertex<T>): Double?

    fun numberOfPaths(
        source: Vertex<T>,
        destination: Vertex<T>
    ): Int {
        val visited: MutableSet<Vertex<T>> = mutableSetOf()
        return paths(source, destination, visited)
    }

    fun paths(
        source: Vertex<T>, destination: Vertex<T>, visited: MutableSet<Vertex<T>>, printPath: Boolean = true
    ): Int {
        var ct = 0
        visited.add(source)
        if (source == destination) {
            ct = 1
            if (printPath) {
                visited.forEach {
                    print("->${it.data}")
                }
                println()
            }
        } else {
            val neighbors = edges(source)
            neighbors.forEach { edge ->
                if (edge.destination !in visited)
                    ct += paths(edge.destination, destination, visited)
            }
        }
        visited.remove(source)
        return ct
    }

    fun breadthFirstSearch(source: Vertex<T>): ArrayList<Vertex<T>> {
        val queue = LinkedListQueue<Vertex<T>>()
        val enqueued = ArrayList<Vertex<T>>()
        val visited = ArrayList<Vertex<T>>()

        queue.enqueue(source)
        enqueued.add(source)
        while (true) {
            val vertex = queue.dequeue() ?: break
            visited.add(vertex)
            val neighborEdges = edges(vertex)
            neighborEdges.forEach {
                if (!enqueued.contains(it.destination)) {
                    queue.enqueue(it.destination)
                    enqueued.add(it.destination)
                }
            }
        }
        return visited
    }

    abstract val allVertices: ArrayList<Vertex<T>>

    fun isDisconnected(): Boolean {
        val firstVertex = allVertices.firstOrNull() ?: return false
        val visited = breadthFirstSearch(firstVertex)
        allVertices.forEach {
            if (!visited.contains(it)) return true
        }
        return false
    }
}
enum class EdgeType {
    DIRECTED, UNDIRECTED
}