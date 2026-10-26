public class 실습문제5 {
    static void main(String[] args) {
        String name = "가을";
        int age = 23;
        double height = 163.0;
        int debut = 2021;

        int activeyear = (2026 - debut);
        String adult = (age > 19) ? "성인" : "미성년자";

        String memberCard = """
                ======================
                IVE 멤버 카드
                ======================
                이름      : %s
                나이      : %d세
                키         : %.1fcm
                활동년수 : %d년
                성인여부 : %s
                ======================
                """.formatted(name, age, height, activeyear, adult);
        System.out.println(memberCard);

    }
}
