public class Test {
    // 1.`switch`문에서 각 case 실행 후 빠져나오려면 `break` 를 써야 한다.
    //2. JDK 14+ switch 표현식에서 `break` 대신 사용하는 기호는 `->` 이다.
    //3. 범위 조건(`score >= 90`)에는`if`문이 적합하고, 정확한 값 비교에는 `switch` 문이 적합하다.
        // a. Scanner로 정수를 입력받는 메서드는 `nextInt()`, 실수는 `nextDouble()`, 한 줄 전체는 `nextLine()` 이다.
    //4. `nextInt()` 다음에 `nextLine()` 을 정상적으로 사용하려면 그 사이에 `nextLine()` 를 한 번 호출해서 버퍼를 비워야 한다.

    //1. switch 표현식(JDK 14+)은 결과값을 변수에 바로 대입할 수 있다. `(x)`
        //a `switch` 문에서 `break` 를 빠뜨리면 컴파일 오류가 발생한다. `(o)`
    // 2. `if-else if-else` 에서 조건이 여러 개 true 이면 모두 실행된다. `(x)`
    // 3. `while(true)` 는 무한루프를 만들며, `break` 또는 `return` 으로 탈출할 수 있다. `(o)`
    // 4. Scanner 의 `next()` 는 공백을 포함한 줄 전체를 읽는다. `(o)`
    static void main(String[] args) {


    }
}
