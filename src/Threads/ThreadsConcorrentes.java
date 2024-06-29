package Threads;

public class ThreadsConcorrentes implements Runnable{
    @Override
    public void run() {
        for (int i = 1; i <=  10; i++) {
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        Thread thread = new Thread(new ThreadsConcorrentes());
        thread.start();
        Thread thread2 = new Thread(new ThreadsConcorrentes());
        thread2.start();
    }
}
