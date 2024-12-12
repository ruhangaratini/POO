package Threads;

public class Worker extends Thread {
    private String name = "";
    private int i = 0;

    public void setWorkerName(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        while (true) {
            i++;
            System.out.println(this.name + ": " + i);
        }
    }

}
