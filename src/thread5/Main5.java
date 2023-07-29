// 스레드 이름은  스레드의 참조값.getName()으로 조회 가능
package thread5;

public class Main5 {
    public static void main(String[] args) {
        Thread thread3 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Get Thread Name");
            }
        });
        thread3.start();

        System.out.println("thread3.getName() = " + thread3.getName());
    }
}
