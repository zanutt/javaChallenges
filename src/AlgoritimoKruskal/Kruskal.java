package AlgoritimoKruskal;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Kruskal {
    int V;
    List<Edge> edges;

    public Kruskal(int v){
        V = v;
        edges = new ArrayList<>();
    }
    /*Adcionar Aresta no grafo*/
    public void addEdge(int inicio, int destino, int peso){
        Edge edge = new Edge(inicio, destino, peso);
        edges.add(edge);
    }
    /*Encontrar o representante do conjunto dos elementos*/
    private int find(Subset[] subsets, int i){
        if (subsets[i].parent != i){
            subsets[i].parent = find(subsets, subsets[i].parent);
        }
        return subsets[i].parent;
    }
    /*Unir conjuntos por rank*/
    private void union(Subset[] subsets, int x, int y){
        int rootX = find(subsets, x);
        int rootY = find(subsets, y);

        if (subsets[rootX].rank < subsets[rootY].rank){
            subsets[rootX].parent = rootY;
        } else if (subsets[rootX].rank > subsets[rootY].rank) {
            subsets[rootY].parent = rootX;
        }else{
            subsets[rootY].parent = rootX;
            subsets[rootX].rank++;
        }
    }

    /*Função Principal*/
    public void algoritimoKruskal(){
        /*Ordenando as arestas*/
        Collections.sort(edges);

        /*Criando array dos subconjuntos*/
        Subset[] subsets = new Subset[V];
        for (int i = 0; i < V; i++){
            subsets[i] = new Subset();
            subsets[i].parent = i;
            subsets[i].rank = 0;
        }
        /*Lista das arestas*/
        List<Edge> resultado = new ArrayList<>();
        int contador = 0;

        /*Iteraçao pelas arestas selecionando com menor peso e que nao formam ciclos*/
        for (Edge edge : edges){
            if (contador == V - 1) break;

            int x = find(subsets, edge.inicio);
            int y = find(subsets, edge.destino);

            if (x != y){
                resultado.add(edge);
                union(subsets, x, y);
                contador++;
            }

        }

        /*Exibe as arestas*/
        for (Edge edge : resultado){
            System.out.println(edge.inicio + " -- " + edge.destino +" -- " + edge.peso);
        }
    }



}
