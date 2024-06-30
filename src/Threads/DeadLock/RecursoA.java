package Threads.DeadLock;

public class RecursoA {
    public synchronized void metodoA(RecursoB recursoB){
        System.out.println("RecursoA: tentenado acessar RecursoB...");
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        recursoB.metodoB(this);
    }
}
