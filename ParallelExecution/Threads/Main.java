package Threads;

public class Main {

    public static void main(String[] args) {
        Worker a = new Worker();
        Worker b = new Worker();
        a.setWorkerName("A");
        b.setWorkerName("B");

        a.setPriority(5);
        b.setPriority(10);

        a.start();
        b.start();

//        while (true) {
//            System.out.println("Main!");
//        }

        Thread thread = new Thread() {
            public void run() {
                while (true) {
                    System.out.println("Anonymous");
                }
            }
        };

        thread.start();

        Runner runner = new Runner();
        Thread threadRunner = new Thread(runner);

        threadRunner.start();

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                while (true) {
                    System.out.println("Anonymous Runnable");
                }
            }
        };

        Thread runnableThread = new Thread(runnable);

        runnableThread.start();

        Runnable lambda = () -> {
            while (true) {
                System.out.println("Lambda");
            }
        };

        Thread threadLambda = new Thread(lambda);
        threadLambda.start();
    }

}
