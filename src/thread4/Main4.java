// Thread 익명 하위 객체를 활용한 스레드 생성 및 실행
package thread4;

public class Main4 {
    public static void main(String[] args) {
        Thread thread2 = new Thread(){
            public void run(){
                for (int i = 0; i < 100; i++){
                    System.out.print("#");
                }
            }
        };
        thread2.start();

        for (int i = 0; i < 100; i++){
            System.out.print("@");
        }
    }
}
