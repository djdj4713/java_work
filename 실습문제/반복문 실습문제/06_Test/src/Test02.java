public class Test02 {
    static void main(String[] args) {
        for (int i = 10; i >= 1; i--) {
            if (i == 3) {
                continue;
            }
            System.out.print(i + " ");
        }
    }
}
