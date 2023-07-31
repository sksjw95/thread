package thread9;

public class MyThread implements Runnable{

    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
}
