import java.util.Scanner;

public class Alarm {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("시간을 입력하세요 : ");
        int h = scanner.nextInt();

        System.out.println("분을 입력하세요 : ");
        int m = scanner.nextInt();

        m -= 45;

        if (m < 0) {
            m += 60;
            h -= 1;
        }
        if (h < 0) {
            h = 23;
        }
        System.out.println(h + " " + m);
    }
}
