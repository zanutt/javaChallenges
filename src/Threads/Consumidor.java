package Threads;

import java.util.concurrent.BlockingQueue;

public class Consumidor implements Runnable {
    private final BlockingQueue<Integer> fila;

    public Consumidor(BlockingQueue<Integer> fila) {
        this.fila = fila;
    }

    @Override
    public void run() {
        try {
            while (true) {
                Integer item = fila.take();
                System.out.println("Consumindo: " + item);
                Thread.sleep(550);
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}