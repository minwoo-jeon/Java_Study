package scanner;

import java.util.Scanner;

public class ScannerWhile2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("첫번쨰 숫자와 두 번쨰 숫자 모두 0 을 입력하면 프로그램을 종료합니다.");

        while (true){
            System.out.print("첫번쨰 숫자를 입력해주세요 :");
            int num1 = scanner.nextInt();

            System.out.print(" 두번쨰 숫자를 입력해주세요 :");
            int num2 = scanner.nextInt();


            if(num1 ==0 & num2 ==0 ){
                System.out.println("프로그램을 종료합니다");
                break;
            }else{
                int sum = num1 + num2;
                System.out.println("두수의 합은 :"+sum+"입니다");
            }
        }


    }
}
