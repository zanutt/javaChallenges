package Threads.DeadLock;

public class Thread1 implements Runnable {
    private RecursoA recursoA;
    private RecursoB recursoB;

    public Thread1(RecursoA recursoA, RecursoB recursoB) {
        this.recursoA = recursoA;
        this.recursoB = recursoB;
    }

    @Override
    public void run() {
        synchronized (recursoA) {
            System.out.println("Thread1: bloqueou RecursoA");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            System.out.println("Thread1: tentando acessar RecursoB");
            recursoA.metodoA(recursoB);
        }
    }
}