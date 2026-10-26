import java.util.Scanner;

public class CoffeeMachine {
    static void main(String[] args) {
        int coffee = 1500;
        int juice = 1000;
        int water = 500;

        Scanner scanner = new Scanner(System.in);
        System.out.println("투입할 금액을 입력하세요 : ");
        int balance = 0;

        while (true) {
            System.out.println("(1) 돈 투입 | (2) 음료 선택 | (3) 잔액 확인 | (4) 종료");
            System.out.print("선택: ");
            int menu = scanner.nextInt();

            switch (menu) {
                case 1 -> {
                    System.out.print("투입 금액: ");
                    balance += scanner.nextInt();
                    System.out.println("현재 잔액: " + balance + "원");
                }
                case 2 -> {
                    System.out.print("1.커피 2.주스 3.물 선택: ");
                    int drink = scanner.nextInt();

                    int price = switch (drink) { case 1 -> 1500; case 2 -> 1000; case 3 -> 500; default -> 0; };
                    String name = switch (drink) { case 1 -> "커피"; case 2 -> "주스"; case 3 -> "물"; default -> ""; };

                    if (price == 0) {
                        System.out.println("잘못된 번호입니다.");
                    } else if (balance >= price) {
                        balance -= price;
                        System.out.println(name + " 구매 완료! 남은 잔액: " + balance + "원");
                    } else {
                        System.out.println("잔액 부족! (현재 잔액: " + balance + "원)");
                    }
                }
                case 3 -> {
                    System.out.println("현재 잔액: " + balance + "원");
                }
                case 4 -> {
                    System.out.println("종료합니다. 잔돈 " + balance + "원 반환.");
                    return;
                }
                default -> System.out.println("1~4 사이를 입력하세요.");
            }
        }
    }
}

