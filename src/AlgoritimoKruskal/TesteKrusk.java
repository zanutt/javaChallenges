package AlgoritimoKruskal;

public class TesteKrusk {
    public static void main(String[] args) {
        int V = 4;  // Número de vértices no grafo
        Kruskal graph = new Kruskal(V);

        // Adiciona arestas ao grafo
        graph.addEdge(0, 1, 10);
        graph.addEdge(0, 2, 6);
        graph.addEdge(0, 3, 5);
        graph.addEdge(1, 3, 15);
        graph.addEdge(2, 3, 4);

        // Executa o algoritmo de Kruskal
        graph.algoritimoKruskal();
    }
}
