package Threads.DeadLock;

public class DeadLock {
    public static void main(String[] args) {
        RecursoA recursoA = new RecursoA();
        RecursoB recursoB = new RecursoB();

        Thread1 thread1 = new Thread1(recursoA, recursoB);
        Thread2 thread2 = new Thread2(recursoA, recursoB);

        new Thread(thread1).start();
        new Thread(thread2).start();
    }
}
