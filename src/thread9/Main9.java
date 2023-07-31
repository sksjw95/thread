package thread9;

public class Main9 {
    public static void main(String[] args) {
        Runnable r1 = new MyThread();
        Thread t1 = new Thread(r1);
        t1.start();

    }
}
