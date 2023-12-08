package scanner.ex;

import java.util.Scanner;

public class ScannerWhileEx2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.print("상품 가격을 입력하세요 (-1 을 입력하면 프로그램 종료)");
            int price = input.nextInt();
            if (price < 0) {
                System.out.println("프로그램을 종료합니다");
                break;

            }
            System.out.print("구매하려는 수량을 입력하세요");
            int  quantity = input.nextInt();

            int totalPrice = price * quantity;
            System.out.println("총 비용은"+totalPrice+"입니다");

        }
    }
}
