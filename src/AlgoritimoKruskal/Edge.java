package AlgoritimoKruskal;

public class Edge implements Comparable<Edge>{

    int inicio, destino, peso;

    public Edge(int inicio, int destino, int peso){
        this.inicio = inicio;
        this.destino = destino;
        this.peso = peso;
    }

    /*Método para comparar*/
    public int compareTo(Edge compareEdge){
        return this.peso - compareEdge.peso;
    }

}
