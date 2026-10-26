public class Test02_b {
    static void main(String[] args) {
        int i = 10;
        do {
            if (i == 3) {
                i--;
                continue;
            }
            System.out.print(i + " ");
            i--;
        } while (i >= 1);
    }
}