package scope;

public class Scope1 {

    //지역 변수=> 말그대로 선언 지역에서 만 사용가능. 메서드앞 {시작부터 }끝.
    public static void main(String[] args) {
        int m =10; //m 생존 시작
        if (true) {
            int x =20; //x 생존 시작
            System.out.println("if m ="+m);
            System.out.println("if x ="+x);
        }//x 는 생존 종료
        //System.out.println("main x ="+x); //x 는 접근불가
        //System.out.println("main x ="+m); //m 접근가능
    }//m 생존 종료
}
