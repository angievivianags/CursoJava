package threads;

class Counter implements Runnable{

    private int valor;
    public Counter(int valor) {
       this.valor =  valor;
    }

    @Override
    public void run() {
        System.out.printf("Estado %s \n", Thread.currentThread().getState());
        for (int i = valor; i >= 0; i--) {
            System.out.printf("%s valor %d \n",Thread.currentThread().getName(),i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
        }
    }
}
public class Dev4jCounter {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new Counter(10),"Hilo 1");
        System.out.printf("Estado %s\n", thread.getState());

        thread.start();
        Thread thread2 = new Thread(new Counter(10),"Hilo 2");
        thread2.start();
        System.out.println("Se lanzaron los hilos");
        thread.join();
        thread2.join();
        System.out.printf("Estado %s\n", thread.getState());
        System.out.println("Fin del programa");
    }
}
