package Threads;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class ProdutorConsumidor {
    private static final int TAMANHO_MAXIMO_FILA = 10;
    private static final BlockingQueue<Integer> fila = new LinkedBlockingQueue<>(TAMANHO_MAXIMO_FILA);

    public static void main(String[] args) {
        Produtor produtor = new Produtor(fila);
        Consumidor consumidor = new Consumidor(fila);

        Thread threadProdutor = new Thread(produtor);
        Thread threadConsumidor = new Thread(consumidor);

        threadProdutor.start();
        threadConsumidor.start();

    }
}
