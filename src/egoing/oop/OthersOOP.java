package egoing.oop;


import java.io.FileWriter;
import java.io.IOException;

/**
 * 클래스, 인스턴스를 만들기 전에
 * 먼저 남들이 만들어 놓은 클래스, 인스턴스를 먼저 살펴보자.
 * 우리가 그동안 계속 사용한 코드에서 뭐가 클래스이고 뭐가 인스턴스인지
 * 개념을 잡아보자.
 */

/**
 * class : System, Math, FileWriter
 * instance : f1, f2
 */
public class OthersOOP {
    public static void main(String[] args) throws IOException {
        /**
          * Math 클래스 : 수학과 관련된 기능(변수나 메소드)이 모여 있는 클래스
          * PI : 클래스 Math의 변수
          * floor, ceil : 클래스 Math의 메소드
         * 즉, 서로 연관된 변수나 메소드를 모아서 그룹핑한 껍데기가 클래스이다.
         */
        System.out.println(Math.PI); //Math의 변수
        System.out.println(Math.floor(1.8)); //Math의 메소드
        System.out.println(Math.ceil(1.8));

        FileWriter f1 = new FileWriter("data.txt");
        /**
         * FileWriter 클래스의 경우 인스턴스를 생성했다.
         * new 키워드를 사용해서 data.txt에다가 파일을 저장하는 상태를 가진
         * FileWriter라는 클래스의 복제본이 생김.
         */
        f1.write("Hello");
        f1.write(" Java");

        /**
         * Math VS FileWriter
         * Math의 경우에는 클래스를 바로 사용함.
         * FileWriter은 앞에 new를 붙여서 f1이라는 변수에 담기는 클래스의 복제본을 만듦.
         * 그리고 내부적으로 그 복제본은 data.txt라는 파일에 내용을 저장하겠다는 상태를 가지고 있음.
         *
         * Math는 내부적으로 어떤 상태를 계속 유지하고 있을 필요가 없음. 그냥 한 번 올림, 내림해주면 끝임.
         * 그런데 FileWriter의 경우엔 서로 다른 인스턴스에서 내부 상태를 서로 다르게 유지를 해야 됨.
         */

        FileWriter f2 = new FileWriter("data2.txt");
        f2.write("Hello");
        f2.write(" Java2");
        f2.close();
        /**
         * 그래서 f1같은 경우엔
         * f2와는 '다른' 복제본이 된다.
         * 서로 data.txt, data2.txt라는 다른 상태를 가지고 있고
         * 서로에게 영향을 주지 않는다.
         */


        f1.write("!!!");
        f1.close();
        /**
         * 그래서 이렇게 아래에 따로 내용을 추가해도
         * f1에만 영향이 가지, f2는 별개로 아무 영향이 없다.
         *
         * 그러하듯이 긴 맥락(뭐 변수를 새로 지정해준다던지 등등)을 가지고 작업하는 경우
         * 클래스를 일회용을로 쓰고 마는 게 아니라 인스턴스를 생성해서 작업한다.
         */

    }
}
