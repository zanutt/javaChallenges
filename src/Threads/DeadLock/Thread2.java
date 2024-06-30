package Threads.DeadLock;

public class Thread2 implements Runnable {
    private RecursoA recursoA;
    private RecursoB recursoB;

    public Thread2(RecursoA recursoA, RecursoB recursoB) {
        this.recursoA = recursoA;
        this.recursoB = recursoB;
    }

    @Override
    public void run() {
        synchronized (recursoB) {
            System.out.println("Thread2: bloqueou RecursoB");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            System.out.println("Thread2: tentando acessar RecursoA");
            recursoB.metodoB(recursoA);
        }
    }
}