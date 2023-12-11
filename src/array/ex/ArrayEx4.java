package array.ex;

import java.util.Scanner;

public class ArrayEx4 {
    /*사용자에게 5개의 정수를 입력받아서 이들 정수의 합계와 평균을 계산하는 프로그램을 작성하자*/

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];
        int total = 0;
        double avg;

        System.out.println("5개의 정수를 입력하세요.");
        for(int i =0; i <numbers.length; i++){
            numbers[i] = scanner.nextInt();
            total += numbers[i];
        }
         avg = (double)total/numbers.length;
        System.out.println("입력한 정수의 합계: "+ total);
        System.out.println("입력한 정수의 평균: "+ avg);
    }
}
