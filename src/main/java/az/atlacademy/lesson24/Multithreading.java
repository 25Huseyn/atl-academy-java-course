package az.atlacademy.lesson24;

public class Multithreading extends Thread {

    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName());
        }
    }
}
