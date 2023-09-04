package egoing.oop.myoop.instance;

class Print {
    /**
     * 인스턴스를 만들어서
     * delimiter의 값을 바꿔 사용하고 싶은데,
     * static이 붙어 있으면 무조건 클래스 멤버로 처리가 된다.
     * 그래서 인스턴스로 사용을 하려면 static을 없애야 한다.
     */
    public String delimiter = "";
    public void A() {
        System.out.println(delimiter);
        System.out.println("A");
        System.out.println("A");
    }
    public void B() {
        System.out.println(delimiter);
        System.out.println("B");
        System.out.println("B");
    }
}

public class MyOOP {
    public static void main(String[] args) {
        Print p1 = new Print();
        p1.delimiter = "--------";
        p1.A();
        p1.A();
        p1.B();
        p1.B();


        Print p2 = new Print();
        p2.delimiter = "*********";
        p2.A();
        p2.A();
        p2.B();
        p2.B();

        p1.B(); //p1에 상태가 저장되어 있기 때문에 굳이 구분선 변수를 수정 안 해도 된다.

        p2.A();
    }
}
