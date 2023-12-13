package method.ex;

public class MethodRef1 {
    public static void main(String[] args) {
        /*문제 - 평균값 리펙토링
        메서드를 잘 이해하고 있는지 확인하기 위해 다음 코드를 메서드를 사용하도록 리펙토링해보자*/

        System.out.println("평균값" + avg(1,2,3));

    }

    public static double avg(int a, int b, int c) {
        int sum = a + b + c ;
        return  sum/ 3.0;
    }
}