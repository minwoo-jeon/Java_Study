package method.ex;

import java.util.Scanner;

public class MethodEx4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int balance = 0; //현재잔액


        while (true) {
            System.out.println("1.입금 | 2.출금 | 3.잔액 확인 | 4. 종료");
            int menu = scanner.nextInt();

            if (menu == 1) {
                System.out.print("입금액을 입력하세요.");
                int amount = scanner.nextInt();
                balance = depositAmount(amount, balance);
            } else if (menu == 2) {
                System.out.print("출금액을 입력하세요.");
                int amount = scanner.nextInt();
                balance = withdraw(amount, balance);
            } else if (menu == 3) {
                System.out.println("현재 잔액" + balance + "원");
                break;
            } else if (menu == 4 ) {
                System.out.println("시스탬을 종료합니다.");
                break;
            }else {
                System.out.println("잘못된 번호입니다.");
        }


        }



    }

    public static int depositAmount(int amount,int balance) {
        balance += amount;
        System.out.println(amount + "원을 입금하셨습니다. 현재 잔액: "+ balance+ "원");
        return balance;
    }

    public static int withdraw(int amount, int balance) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println(amount + "원을 출금 하셨습니다. 현재 잔액: " + balance + "원");

        } else {
            System.out.println(amount + "원을 출금하려 했으니 잔액이 부족합니다.");
        }
        return balance;
    }
}

