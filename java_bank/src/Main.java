import bank.Bank;

public class Main {
    static void main(String[] args) {
        String name = "홍길동";
        int age = 25;
        boolean VIP = false;
        String grade = "B";
        double money = 0;
        double salary = 0;

        System.out.println("""
                ======자바 은행======
                """);
        Bank.guestCount++;
        int guestNumber = Bank.guestCount;

        System.out.println("고객번호 : " + guestNumber + " / 이름 : " + name + " / 나이 : " + age + " / 등급 : " + grade);

        int ticketMachin = 100;
        int myTicket = ticketMachin++;

        System.out.println("내 번호표 : " + myTicket +",  다음 대기 번호 : " + ticketMachin);


        String window = (myTicket % 2 == 0) ? "1번 창구로 오세요" : "2번 창구로 오세요";
        System.out.println("안내 : " + window);

        long dposit = 50000;
        money = money + dposit;
        Bank.workCount++;
        System.out.println("입금 후 잔액 : " + (long) money);

        long fee = VIP ? 0 : Bank.FEE;
        System.out.println("출금 수수료 : " + fee);

        long withdrawal = 12500;
        money = money - (withdrawal + fee);
        Bank.workCount++;
        System.out.println("출금 후 잔액 :  " + (long) money);

        long interset = (long) (money * Bank.BOUNS_RATE);
        System.out.println("이자 : " + interset);
        Bank.workCount++;

        money = money + interset;

        System.out.println("이자 지급 후 잔액 : " + (long) money);

        boolean loan = (age >= 19) && (money >= 30000);
        System.out.println("대출 가능 : " + loan);

        boolean preferred = (salary != 0) && (money >= (salary * 2));
        System.out.println("우대 대상 : " + preferred);
        // 0나누기 이해가 잘 안됨

        long tenThousand = (long) money / 10000;
        long remaining = (long) money % 10000;
        long thousand = remaining / 1000;
        remaining = remaining % 1000;
        long hundred = remaining / 100;
        remaining = remaining % 100;

        System.out.println("만원권" + tenThousand + "장, " + "천원권" +  thousand + "장, " + "백원" +hundred + "개, " + "남은 금액 " + remaining + "원" );

        Bank.guestCount++;
        System.out.println("오늘의 총 고객 수: " + Bank.guestCount + "명 " + "거래 건수 : " + Bank.workCount + "건");


        // 1. Bank.BONUS_RATE = 0.05;를 실행하면 어떻게 될까요?
        // - 상수로 지정되어있어서 추가 불가
        // int total = Integer.MAX_VALUE;로 저장한 다음 total + 1을 출력하면 어떻게 될까요? 어떻게 해결할 수 있을까요?
        // -
        // guestCount를 static으로 선언하는 이유는 무엇일까요?
        // - 공유하기 위해 / 고객이 늘 때마다 누적해서 셀 수 없음

        int total = Integer.MAX_VALUE;
        System.out.println(total++);
    }
}
