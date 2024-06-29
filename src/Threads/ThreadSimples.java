package Threads;


/*Thread que imprime numeros de 1 a 10 a cada 1 segundo*/
public class ThreadSimples  extends Thread{
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
        ThreadSimples thread = new ThreadSimples();
        thread.start();
    }
}


