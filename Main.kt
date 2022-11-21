fun getGraph(): AdjacencyMatrix<String> {
    val graph = AdjacencyMatrix<String>()
    val singapore = graph.createVertex("Singapore")
    val tokyo = graph.createVertex("tokyo")
    val hongKong = graph.createVertex("hongKong")
    val detroit = graph.createVertex("detroit")
    val sanFrancisco = graph.createVertex("sanFrancisco")
    val washingtonDC = graph.createVertex("washingtonDC")
    val austinTexas = graph.createVertex("austinTexas")
    val seattle = graph.createVertex("seattle")
    graph.add(EdgeType.UNDIRECTED, singapore, hongKong, 300.0)
    graph.add(EdgeType.UNDIRECTED, singapore, tokyo, 500.0)
    graph.add(EdgeType.UNDIRECTED, hongKong, tokyo, 250.0)
    graph.add(EdgeType.UNDIRECTED, tokyo, detroit, 450.0)
    graph.add(EdgeType.UNDIRECTED, tokyo, washingtonDC, 300.0)
    graph.add(EdgeType.UNDIRECTED, hongKong, sanFrancisco, 600.0)
    graph.add(EdgeType.UNDIRECTED, detroit, austinTexas, 50.0)
    graph.add(EdgeType.UNDIRECTED, austinTexas, washingtonDC, 292.0)
    graph.add(EdgeType.UNDIRECTED, sanFrancisco, washingtonDC, 337.0)
    graph.add(EdgeType.UNDIRECTED, washingtonDC, seattle, 277.0)
    graph.add(EdgeType.UNDIRECTED, sanFrancisco, seattle, 218.0)
    graph.add(EdgeType.UNDIRECTED, austinTexas, sanFrancisco, 297.0)
    return graph
}

fun main(){
    val graph = getGraph()
    println(graph)
}