package egoing.oop.static1;

class Foo {
    public static String classVar = "I class var";
    public String instanceVar = "I instance var";
    public static void classMethod() {
        System.out.println(classVar);
        // System.out.println(instanceVar); //ERROR
        /**
         * static 메소드에서는 static 변수만 사용 가능하고, 인스턴스 변수는 사용 불가능하다.
         */
    }
    public void instanceMethod() {
        System.out.println(classVar);
        System.out.println(instanceVar);
        /**
         * 인스턴스 메소드에서는 클래스변수 인스턴스 변수 둘 다 쓸 수 있다.
         */

    }

}


public class StaticApp {
    public static void main(String[] args) {
        System.out.println(Foo.classVar); //OK
        //System.out.println(Foo.instanceVar); //ERROR
        /**
         * static이 붙은 클래스 변수는 클래스로 바로 접근이 되지만,
         * static이 없는 변수는 바로 접근이 안 된다. 오직 인스턴스를 생성으로 접근할 수 있다.
         */

        Foo.classMethod();
        // Foo.instanceMethod(); //ERROR
        /**
         * 메소드도 변수와 같이 static이 붙은 클래스 메소드는 객체를 생성하지 않고서는
         * 사용할 수 없다.
         */

        Foo f1 = new Foo();
        System.out.println(f1.instanceVar);
        System.out.println(f1.classVar);
        /**
         * 인스턴스 f1을 통해서
         * 인스턴스 변수에 접근을 하면 새로운 복제본이 생겨서 다른 인스턴스나 원본 클래스에 영향을 주지 않는다.
         * 그런데 클래스 변수는 본 클래스를 참조한다. 즉, 인스턴스에서 클래스 변수를 수정하면 클래스 자체에도 영향을 준다.
         */
        Foo f2 = new Foo();

        f1.classVar = "changed by f1";
        System.out.println(f2.classVar); //클래스변수 수정됨
        System.out.println(Foo.classVar); //클래스변수 수정됨

        f1.instanceVar = "changed by f1";
        System.out.println(f1.instanceVar);
        System.out.println(f2.instanceVar);
        /**
         * 인스턴스 변수는 수정을 해도 복제본이기 때문에 다른 인스턴스 변수에 영향을 주지 않는다!
         */

    }
}
