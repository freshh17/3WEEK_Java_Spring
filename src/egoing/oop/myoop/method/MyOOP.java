package egoing.oop.myoop.method;

// 클래스를 사용하기 전에 클래스가 없으면 뭐가 불편한지 살펴보는 시간
// 변수와 메소드로 코드를 작성해보자.

/**
 * 똑같은 코드가 반복되는데 구분선만 바뀌는 경우
 * 1. 동일한 부분은 메소드로 묶고 파라미터로 구분선을 받는다. => 그러나 함수 호출이 1억개가 되면 구분선이 중복이 되어도 1억번을 입력해야 된다.
 * 2. 그래서 인자를 변수로 지정해서 변수만 수정한다. => 인자를 매번 써야 된다.
 *      => 인자 쓰지 말고 그냥 메소드 안에서 메소드 밖에 있는 구분선 변수를 사용할 수는 없나?
 *      => 그럴 수 없다. 메소드 안에서 정의된 변수는 그 메소드 안에서만 쓸 수가 있다.
 * 3. 그러면 MyOOP 클래스 소속의 변수를 만들면 된다. 메소드 내에서 그 이름의 변수가 정의되어 있지 않으면 클래스 변수를 찾는다.
 *      -> 인자에 아무것도 안 쓰고 코드를 간결하게 쓸 수 있다. 유지보수하기가 쉬워졌다.
 */
public class MyOOP {
    public static void main(String[] args) {
        delimiter = "--------";
        printA();
        printA();
        printB();
        printB();

        delimiter = "*********";
        printA();
        printA();
        printB();
        printB();
    }

    /**
     * delimiter, printA(), printB()는 서로 연관성이 높다. 성격이 비슷하다.
     * -> 클래스로 묶으면 훨씬 더 간결해진다.
     */
    public static String delimiter = ""; // 클래스 변수 하나로 코드가 깔끔해짐.

    public static void printA() {
        System.out.println(delimiter); //2. 메인 메소드의 구분선 변수를 사용할 수는 없나? 없음!!! 클래스 변수를 만들어야 됨.
        System.out.println("A");
        System.out.println("A");
    }

    public static void printB() {
        System.out.println(delimiter);
        System.out.println("B");
        System.out.println("B");
    }
}
