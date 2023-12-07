package operator;

public class OperationEx1 {
    public static void main(String[] args) {
        //문제1번
        int num1 = 10;
        int num2 = 20;
        int num3 = 30;
        int sum =num1+num2+num3;
        int avg = sum/3;
        System.out.println(sum);
        System.out.println(avg);
        //문제2번
        double var1 = 1.5;
        double var2 = 2.5;
        double var3 = 3.5;
        double sum1 = var1+var2+var3;
        double avg2 = sum1/3;
        System.out.println(sum1);
        System.out.println(avg2);
        //문제3번
        int score = 90;
        boolean result = 80 <= score && score <=100 ;
        System.out.println(result);
    }



}
