package comd.ex;

public class Ex7 {
    public static void main(String[] args) {
        /*문제: 홀수 짝수 찾기
        정수 x가 주어지면 x가 짝수이면 "짝수"를,'x'가 홀수이면 "홀수"를 출력하는 프로그램을 작성하자
        삼항 연산자를 사용해야 한다.*/
            int x = 3;
            String result1 = (x%2 == 0) ? "짝수" : "홀수";
        System.out.println("x ="+ x +  "," +result1 +"입니다");
    }
}



