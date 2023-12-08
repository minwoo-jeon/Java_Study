package scanner.ex;

import java.util.Scanner;

public class ScannerWhileEx1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("이름을 입력하세요(종료를 입력하면 종료) :");
            String name = scanner.nextLine(); //nextLine은 sda/n 한줄을다읽음

            if(name.equals("종료")) {
                System.out.println("프로그램을 종료합니다");
                break;
            }

            System.out.print("나이를 입력하세요");
            int age = scanner.nextInt(); //nextInt 는 10/n 숫자만 읽음
            scanner.nextLine(); //n 읽고 버림

            System.out.println("입력한이름: " +name+ ",나이 :" +age);

            }
        }
    }

