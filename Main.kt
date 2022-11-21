fun main() {
    val graph = AdjacencyMatrix<String>()
    val A = graph.createVertex("A")
    val B = graph.createVertex("B")
    val C = graph.createVertex("C")
    val D = graph.createVertex("D")
    graph.add(EdgeType.UNDIRECTED, A, B, 1.0);graph.add(EdgeType.UNDIRECTED, B, C, 1.0)
    graph.add(EdgeType.UNDIRECTED, C, A, 1.0);graph.add(EdgeType.UNDIRECTED, C, D, 1.0)

    println(graph.hasCycle(A))
    println(graph.hasCycle(B))
    println(graph.hasCycle(C))
    println(graph.hasCycle(D))
}