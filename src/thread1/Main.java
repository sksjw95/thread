// 메인 스레드 외에 별도의 작업 스레드를 활용한다는 것은, 다시 말해 작업 스레드가 수행할 코드를 작성하고,
// 작업 스레드를 생성하여 실행시키는 것을 의미한다.
// 작업 스레드를 생성하고 실행하는 방법은 두 가지가 있다.
// 1. Runnable 인터페이스를 구현한 객체에서 run()을 구현하여 스레드를 생성하고 실행하는 방법
package thread1;

public class Main {
    public static void main(String[] args) {

        // Runnable 인터페이스를 구현한 객체 생성
        Runnable task1 = new ThreadTask1();
        // Runnable 구현 객체를 인자로 전달하면서 thread 클래스를 인스턴스화 하여 스레드를 생성
        Thread thread1 = new Thread(task1);
        // 위의 두 줄을 아래와 같이 한 줄로 축약할 수도 있다.
        // Thread thread1 = new Thread(new ThreadTask1());

        // 스레드를 생성하는 것만으로는 run() 내부의 코드가 실행되지는 않는다.
        //run() 메서드 내부의 코드를 실행하려면 start() 메서드를 아래와 같이 호출하여 스레드를 실행시켜주어야 한다.
        thread1.start();

        // 반복문 추가
        for(int i = 0; i < 100; i++){
            System.out.print("@");
        }

        // 메인 스레드 -> @ 작업 스레드 -> #
        // 즉, 메인 스레드와 작업 스레드가 동시에 병렬로 실행

    }
}