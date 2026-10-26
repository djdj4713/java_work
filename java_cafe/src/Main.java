import cafe.Cafe;

public class Main {
    static void main(String[] args) {
        String name = "김자바";
        int age = 20;
        boolean member = true;
        String grade = "S";
        long wallet = 20000;
        int stemp = 8;
        int referral = 0;

        System.out.println("""
                ===자바 카페===
                """);

        System.out.println("고객 : " + name + " / 나이 : " + age + " / 회원 : " + member + " / 등급 : " + grade);

        int orderNumber = 200;
        int myOrderNumber = orderNumber++;

        System.out.println("내 주문번호 : " + myOrderNumber + ", 다음 주문 번호 : " + orderNumber);

        String pickup = (myOrderNumber % 2 == 0) ? "픽업대 A에서 받아가세요" : "픽업대 B에서 받아가세요";
        System.out.println("안내: " + pickup);

        int americanoPrice = 4500;
        int cakePrice = 6800;

        Cafe.orderCount++;
        Cafe.cupCount += 2;

        int totalPrice = (americanoPrice * 2) + cakePrice;

        System.out.println("주문 금액 : " + totalPrice);

        int discount = member ? (int) (totalPrice * Cafe.SALE_RATE) : 0;

        System.out.println("할인 금액 : " + discount);

        double finalPrice = member ? (totalPrice - discount) : totalPrice;
        int pay = (int) finalPrice;
        System.out.println("결제 금액 : " + pay + "원");

        int change = (int) (wallet - pay);
        System.out.println("거스름 돈 : " + change);

        long thousand = (int)change / 1000;
        long remaining = (int) change % 1000;
        long fiveHundred = (int) remaining / 500;
        remaining = remaining % 500;
        long hundred = (int) remaining / 100;
        remaining = remaining % 100;
        long ten = (int) remaining / 10;
        System.out.println("천원권 " + thousand + "장" + ", 오백원 " + fiveHundred + "개, " + "십원 " + ten + "개, " + " 남은 금액 " + remaining + "원");

        int frineds = 0;

        stemp += 2;
        System.out.println("스탬프 : " + stemp + "개");

        boolean coupon = member && (stemp >= 10);
        System.out.println("무료 음료 쿠폰 : " + coupon);

        boolean dutchPay = (frineds != 0) && (pay / frineds >=5000);
        System.out.println("더치 페이 대상 : " + dutchPay);

        Cafe.orderCount++;
        Cafe.cupCount += 1;
        System.out.println("오늘으 주문 : " + Cafe.orderCount + "건, " + "판매 잔 수 : " + Cafe.cupCount + "잔");

        byte stamp = 127;
        stamp++;
        System.out.println("결과값" + stamp);
        //Cafe.SALE_RATE = 0.5;를 실행하면 어떻게 될까요?
        //- 은행 과 같은 답
        //byte stamp = 127; 다음에 stamp++;를 실행하면 값이 어떻게 될까요? 이유는 무엇일까요?
        //- -128
        //cupCount를 static으로 선언하는 이유는 무엇일까요?
        //-

        }


    }

