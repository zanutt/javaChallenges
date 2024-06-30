package Threads;

import java.util.concurrent.BlockingQueue;

class Produtor implements Runnable {
    private final BlockingQueue<Integer> fila;

    public Produtor(BlockingQueue<Integer> fila) {
        this.fila = fila;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 20; i++) {
                System.out.println("Produzindo: " + i);
                fila.put(i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
