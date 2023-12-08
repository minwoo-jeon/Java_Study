package scanner.ex;

import java.util.Scanner;

public class ScannerWhileEx4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("1: 상품입력, 2: 결제 3: 프로그램 종료");
        int option = scanner.nextInt();
        int productPrice =0;
        int  productCount =0;
        while (true) {
            if (option == 3){
                System.out.println("프로그램을 종료합니다");
                break;
            }
            if (option == 1) {
                System.out.print("상품명을 입력하세요");
                String productName = scanner.nextLine();

                System.out.print("상품의 가격을 입력하세요");
                productPrice = scanner.nextInt();


                System.out.println("구매 수량을 입력하세여");
                productCount = scanner.nextInt();
            }else if (option == 2){
                 System.out.println("총비용 :" + productPrice*productCount );
            }
            }
        }
    }
