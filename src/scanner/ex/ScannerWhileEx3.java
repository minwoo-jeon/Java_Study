package scanner.ex;

import java.util.Scanner;

public class ScannerWhileEx3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum =0;
        int count =0;
        int input =0;
        System.out.println("숫자를 입력하세요.압력을 중단하려면 -1을 입력하세요");

        /* while (true) {

             num1 = input.nextInt();
            if(input == -1){
                System.out.println("입력을 중단합니다");
                break;
            }
            sum += input;
            count++;
        }*/
        while((input = scanner.nextInt()) != -1) {
            sum += input;
            count++;
        } //위 코드를 3줄로 줄인 코드

        double avg = (double) sum/count; //int +int = 소수점 버리고 정수형 결과가 나오기떄문에  소수점 까지 받기 위해서는 형변환
        System.out.println("입력한 숫자들의 합계"+sum);
        System.out.println("입력한 평균 값"+avg);
    }
}
