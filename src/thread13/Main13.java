package thread13;

public class Main13 {
    public static void main(String[] args) {
        SumThread sumThread = new SumThread();

        sumThread.setTo(10);
        sumThread.start();

        // 메인 스레드가 sumThread의 작업이 끝날떄까지 기다린다.
        try {
            sumThread.join();
        } catch ( Exception e){
        }

        System.out.println(String.format("1부터 %d까지의 합 : %d", sumThread.getTo(), sumThread.getSum()));
    }
}