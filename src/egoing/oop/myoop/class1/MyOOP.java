package egoing.oop.myoop.class1;

// 이제 본격적으로 클래스를 배워보자.
// method.MyOOP를 클래스로 수정해보자.

/**
 * MyOOP.java는 클래스 이름임.
 * 그러니까 자바는 파일명이 클래스명. 이렇게 한 파일 안에 여러 클래스가 있으면 안 됨.
 * 그래서 옆에 class1 패키지를 보면, MyOOP클래스 아래에 MyOOP, Print로 나뉘어 있는 걸 볼 수 있음.
 */
class Print {
    /**
     * 클래스 안에 들어있는 메소드와 변수를 모두 멤버라고 한다.
     * Print 클래스의 멤버 : delimiter, A(), B();
     */
    public static String delimiter = "";
    public static void A() {
        System.out.println(delimiter);
        System.out.println("A");
        System.out.println("A");
    }
    public static void B() {
        System.out.println(delimiter);
        System.out.println("B");
        System.out.println("B");
    }

}

public class MyOOP {
    public static void main(String[] args) {
        Print.delimiter = "--------";
        Print.A();
        Print.A();
        Print.B();
        Print.B();

        Print.delimiter = "*********";
        Print.A();
        Print.A();
        Print.B();
        Print.B();
    }
}
