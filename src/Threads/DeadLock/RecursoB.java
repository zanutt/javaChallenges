package Threads.DeadLock;

public class RecursoB {
    public synchronized void metodoB(RecursoA recursoA){
        System.out.println("RecursoB: tentenado acessar RecursoA...");
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        recursoA.metodoA(this);
    }
}

