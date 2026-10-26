import java.util.Scanner;

public class Test04 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a;
        int b;

        while (true) {
            System.out.println("첫 번째 값을 입력하세요 : ");
            a = scanner.nextInt();

            System.out.println("두 번째 값을 입력하세요 : ");
            b = scanner.nextInt();

            if (a > 0 && b < 10) {
                break;
            }
            System.out.println("조건을 만족하지 않습니다. 다시 입력해주세요.");

        }
        System.out.println(a + " + " + b + " = " + (a + b));



    }
}
