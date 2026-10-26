import java.util.Scanner;

public class OvenTimer {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("현재 시간(시)을 입력하세요 : ");
        int h = scanner.nextInt();
        System.out.println("현재 시간(분)을 입력하세요 : ");
        int m = scanner.nextInt();
        System.out.println("요리 시간(분)을 입력하세요 : ");
        int c = scanner.nextInt();

        m += c ;

        h += m / 60;
        m %= 60;

        h %= 24;

        System.out.println(h + " " + m);


    }
}
