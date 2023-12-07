package operator;

public class Logical1 {

    public static void main(String[] args) {
        System.out.println("&&: AND 연산"); //둘다 참이여야 참
        System.out.println(true && true);
        System.out.println(true && false);
        System.out.println(false && false);

        System.out.println("||: OR 연산"); //둘중 하나만 참 이면 참
        System.out.println(true || true);
        System.out.println(true || false);
        System.out.println(false || false);

        System.out.println("! 연산"); //연산의 결과의 반대가 나옴
        System.out.println(!true);
        System.out.println(!false);
    }
}
