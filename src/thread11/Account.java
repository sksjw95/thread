package thread11;

public class Account {

        // 잔액을 나타내는 변수
        private int balance = 1000;

        public int getBalance() {
            return balance;
        }

        // 인출 성공 시 true, 실패 시 false 반환
        public synchronized boolean withdraw(int money) {
            // 인출 가능 여부 판단 : 잔액이 인출하고자 하는 금액보다 같거나
            // 많아야 한다.
            if (balance >= money) {
                //if문의 실행부에 진입하자마자 해당 스레드를 일시 정지 시키고,
                // 다른 스레드에게 제어권을 강제로 넘깁니다.
                // 일부러 문제 상황을 발생시키기 위해 추가한 코드이다.
                try {
                    Thread.sleep(1000);
                } catch (Exception error) {
                }

                // 잔액에서 인출금을 깍아 새로운 잔액을 기록한다.
                balance -= money;
                return true;
            }
            return false;
        }
    }

