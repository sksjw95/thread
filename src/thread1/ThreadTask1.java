package thread1;

public class ThreadTask1 implements Runnable{
    // run() 메서드 바디에 스레드가 수행할 작업 내용 작성
    public void run() {
        for(int i = 0; i < 100; i++){
            System.out.print("#");
        }
    }
}
