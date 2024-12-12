package Threads;

public class Runner implements Runnable {

    @Override
    public void run() {
        while (true) {
            System.out.println("Runner");
        }
    }

}
