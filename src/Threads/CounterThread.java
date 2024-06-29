package Threads;

/*Conceitos importantes: Sincronização (synchronized): É usada no método increment para garantir que a atualização do contador seja feita de maneira segura quando múltiplos threads acessam o método simultaneamente.
join: Método usado para garantir que o programa principal espere até que os threads t1 e t2 terminem sua execução antes de continuar.
Concorrência: Este exemplo demonstra o uso de threads para executar tarefas concorrentes e a necessidade de sincronização para evitar problemas de corrida (race conditions). */

public class CounterThread extends Thread{
    private Counter counter;

    public CounterThread(Counter counter){
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++){
            counter.increment();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();
        Thread counter1 = new CounterThread(counter);
        Thread counter2 = new CounterThread(counter);

        counter1.start();
        counter2.start();

        counter1.join();
        counter2.join();

        System.out.println("Count: "+counter.getCount());
    }
}
