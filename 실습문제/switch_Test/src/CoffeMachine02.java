import java.util.Scanner;

public class CoffeMachine02 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int money = 0;

        while (true) {
            System.out.println("========================");
            System.out.println("1. 금액추가 2.음료선택 3.잔액출력 4.잔돈반환(종료)");
            System.out.println("========================");
            System.out.println("메뉴 번호를 선택하세요.");
            int menu = scanner.nextInt();


            switch (menu) {
                case 1:
                    System.out.println("금액을 입력하세요.");
                    money = money + scanner.nextInt();
                    System.out.println("현재 잔액은 : " + money + "원 입니다.");
                    break;
                case 2:
                    boolean status = true;
                    while (status) {
                        System.out.println("1. 커피(1500원) 2.주스(1000원) 3.물(500원) 4.종료");
                        System.out.println("번호를 입력하세요.(1~4) : ");
                        int choice = scanner.nextInt();
                        switch (choice) {
                            case 1:
                                if (money >= 1500) {
                                    System.out.println("커피가 나왔습니다.");
                                    money = money - 1500;
                                    System.out.println("현재 잔액은 : " + money + "원 입니다.");
                                } else {
                                    System.out.println("금액이 부족합니다.");
                                }
                                break;
                            case 2:
                                if (money >= 1000) {
                                    System.out.println("주스가 나왔습니다.");
                                    money = money - 1000;
                                    System.out.println("현재 잔액은 : " + money + "원 입니다.");
                                } else {
                                    System.out.println("금액이 부족합니다.");
                                }
                                break;
                            case 3:
                                if (money >= 500) {
                                    System.out.println("물이 나왔습니다.");
                                    money = money - 500;
                                    System.out.println("현재 잔액은 : " + money + "원 입니다.");
                                } else {
                                    System.out.println("금액이 부족합니다.");
                                }
                                break;
                            case 4:
                                System.out.println("음료 선택을 종료합니다.");
                                status = false;
                                break;
                            default:
                                System.out.println("다시 선택하세요.");
                                break;
                        }
                    }

                case 3:
                    System.out.println("현재 잔액은 : " + money + "원 입니다.");
                    break;
                case 4:
                    System.out.println("잔돈 반환 : " + money);
                    money = 0;

                    return;
                default:
                    System.out.println("다시 선택해 주세요.");
        }


        }
    }
}