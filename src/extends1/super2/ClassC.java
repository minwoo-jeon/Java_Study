package extends1.super2;

public class ClassC extends ClassB {

    public ClassC() {
        //super(); //생략가능한 경우는 기본생성자 일떄만 생략가능하다.
        super(10,20);
        System.out.println("ClassC 생성자");
    }
}
