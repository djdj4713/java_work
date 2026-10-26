public class Test01_b {
    public static void main(String[] args) {
        int i = 0;
        while (i < 10) {
            i++;
            if (i == 6) {
                continue;
            }
            System.out.print(i + " ");
        }
    }
}

