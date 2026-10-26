package ifCondition;

import java.util.Scanner;

public class MenuSelect {
    static void main(String[] args) {
        int coffee = 1500;
        int juice = 1000;
        int water = 500;
        Scanner scanner = new Scanner(System.in);
        System.out.println("투입할 금액을 입력하세요 : ");
        int input = scanner.nextInt();
        String result;
        if (input >= coffee) {
            result = "커피, 주스, 물 모두 구매 가능합니다.";
        } else if (input >= juice) {
            result = "주스, 물 구매 가능합니다.";
        } else if (input >= water) {
            result = "물만 구매 가능합니다.";
        } else {
            result = "잔액이 부족합니다.";
        }
        System.out.println(result);

    }
}
