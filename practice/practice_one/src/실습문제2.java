public class 실습문제2 {
    static void main(String[] args) {
        System.out.println("""
                int a = 10;
                a += 3;
                a *= 2;
                System.out.println(a);   // 26
                
                """);
        System.out.println("""
                int x = 5;
                System.out.println(x++); // 5
                System.out.println(x);   // 5""");
        System.out.println("""
                int y = 5;
                System.out.println(++y); // 6
                System.out.println(y);   // 6
                """);
        System.out.println("""
                System.out.println(10 > 5 && 3 < 1);  // 거짓
                System.out.println(10 > 5 || 3 < 1);  // 참
                System.out.println(!(10 > 5));         // 거짓
                """);
        System.out.println("""
                int score = 75;
                String grade = (score >= 80) ? "합격" : "불합격";
                System.out.println(grade);  // 불합격
                """);
    }

}
