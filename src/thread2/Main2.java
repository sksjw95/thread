// 2. Thread클래스를 상속받은 하위 클래스에서 run()를 구현하여 스레드를 생성하고 실행하는 방법

package thread2;

public class Main2 {
    public static void main(String[] args) {


        // Thread 클래스를 상속받은 클래스를 인스턴스화하여 스레드를 생성
        ThreadTask2 thread2 = new ThreadTask2();
        // 작업 스레드를 실행시켜, run() 내부의 코드를 처리하도록 합니다.
        thread2.start();
        // 반복문 추가
        for(int i = 0; i < 100; i++){
            System.out.print("@");
        }
    }
}
