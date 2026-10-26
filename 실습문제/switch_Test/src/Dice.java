import java.util.Scanner;

public class Dice {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("주사위 1 : ");
        int firstDice = scanner.nextInt();
        System.out.println("주사위 2 : ");
        int secondDice = scanner.nextInt();
        System.out.println("주사위 3 : ");
        int thirdDice = scanner.nextInt();

        int prize = 0;

        if (firstDice == secondDice && secondDice == thirdDice) {
            prize = 10000 + (firstDice * 1000);
        } else if (firstDice == secondDice || firstDice == thirdDice) {
            prize = 1000 + (firstDice * 100);
        } else if (secondDice == thirdDice) {
            prize = 1000 + (secondDice * 100);
        }
        else {
            int max = firstDice;
            if (secondDice > max) {
                max = secondDice;
            }
            if (thirdDice > max) {
                max = thirdDice;
            }
            prize = max * 100;
        }
        System.out.println("상금 : " + prize + "원");

    }
}
