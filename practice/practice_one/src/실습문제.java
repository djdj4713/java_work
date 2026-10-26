public class 실습문제 {
    static void main(String[] args) {
        int a = 7;
        int b = 2;
        System.out.println("int 끼리 나눗셈 7/2 의 결과는" + ((double) a / 2));
        int c = 10;
        int d = 3;
        int modCD = c % d;
        System.out.println("10 % 3 의 결과는" + modCD + "이다.");
        System.out.println("a++는 값을 먼저 대입한 후에 증가하고, ++a는 값을 증가시킨후 대입한다..");
        System.out.println("삼항 연산자의 형식은 조건식 ? 참일 때 값 ; 거짓일 때 값이다.");
        System.out.println("String.formatted() 에서 정수를 출력하는 포맷 지정자는 %d, 문자열은 %s, 소수점 2자리 실수는 %.2f 이다.  ");
        System.out.println("%,d에서 , 의 역활은 천단위 구분 표시이다.");
    }
}
