fun main() {
    val graph = AdjacencyMatrix<String>()
    val A = graph.createVertex("A");
    val B = graph.createVertex("B")
    val C = graph.createVertex("C");
    val D = graph.createVertex("D")
    val E = graph.createVertex("E");
    val F = graph.createVertex("F")
    val G = graph.createVertex("G");
    val H = graph.createVertex("H")
    graph.add(EdgeType.UNDIRECTED, A, B, 1.0);graph.add(EdgeType.UNDIRECTED, A, C, 1.0)
    graph.add(EdgeType.UNDIRECTED, A, D, 1.0);graph.add(EdgeType.UNDIRECTED, B, E, 1.0)
    graph.add(EdgeType.UNDIRECTED, C, F, 1.0);graph.add(EdgeType.UNDIRECTED, C, G, 1.0)
    graph.add(EdgeType.UNDIRECTED, E, H, 1.0)

    val vertices = graph.breadthFirstSearch(A)
    vertices.forEach {
        println(it.data)
    }
}