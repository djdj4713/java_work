import java.util.Scanner;

public class No5_ex {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("두 수를 입력받아 큰 수 를 출력합니다.");
        System.out.println("첫 번째 수를 입력하세요.");
        int a = scanner.nextInt();

        System.out.println("두 번째 수를 입력하세요.");
        int b = scanner.nextInt();
        int bigNumber;
        if (a > b) {
            bigNumber = a;
        } else {
            bigNumber = b;
        }
        System.out.println("쿤 수는: " + bigNumber);

    }
}
