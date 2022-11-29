fun main() {
    val graph = AdjacencyList<String>()
    val A = graph.createVertex("A")
    val B = graph.createVertex("B")
    val C = graph.createVertex("C")
    val D = graph.createVertex("D")
    val E = graph.createVertex("E")
    val F = graph.createVertex("F")
    val G = graph.createVertex("G")
    val H = graph.createVertex("H")
    graph.add(EdgeType.DIRECTED, A, B, 8.0); graph.add(EdgeType.DIRECTED, A, G, 1.0)
    graph.add(EdgeType.DIRECTED, A, F, 9.0); graph.add(EdgeType.DIRECTED, B, E, 1.0)
    graph.add(EdgeType.DIRECTED, B, F, 3.0); graph.add(EdgeType.DIRECTED, C, B, 3.0)
    graph.add(EdgeType.DIRECTED, C, E, 1.0); graph.add(EdgeType.DIRECTED, E, B, 1.0)
    graph.add(EdgeType.DIRECTED, E, D, 2.0); graph.add(EdgeType.DIRECTED, F, A, 2.0)
    graph.add(EdgeType.DIRECTED, G, C, 3.0); graph.add(EdgeType.DIRECTED, H, G, 5.0)
    graph.add(EdgeType.DIRECTED, H, F, 2.0)
    val dijkstra = Dijkstra(graph)
    val pathsFromA = dijkstra.shortestPath(A)
    val path = dijkstra.shortestPath(D, pathsFromA)
    path.forEach {
        println("${it.source.data} --|${it.weight ?: 0.0}|--> ${it.destination.data}")
    }
}