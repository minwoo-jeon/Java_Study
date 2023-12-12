package array.ex;

import java.util.Scanner;

public class ProductAdminEx {

    public static void main(String[] args) {

        /*문제와 풀이3
    상품 관리 프로그램 만들기
    자바를 이용하여 상품 관리 프로그램을 만들어 보자. 이 프로그램은 다음의 기능이 필요하다:
    상품 등록: 상품 이름과 가격을 입력받아 저장한다.
    상품 목록: 지금까지 등록한 모든 상품의 목록을 출력한다.
    다음과 같이 동작해야 한다:
    첫 화면에서 사용자에게 세 가지 선택을 제시한다: "1. 상품 등록", "2. 상품 목록", "3. 종료"
       "1. 상품 등록"을 선택하면, 사용자로부터 상품 이름과 가격을 입력받아 배열에 저장한다.
       "2. 상품 목록"을 선택하면, 배열에 저장된 모든 상품을 출력한다.
       "3. 종료"를 선택하면 프로그램을 종료한다.*/

        Scanner scanner = new Scanner(System.in);
        int maxProduct = 10;
        String [] productNames = new String [maxProduct];
        int [] productPrices = new int[maxProduct];
        int productCounts = 0; //현재 등록된 상품의 개수를 저장할 int 변수

        while (true) {
            System.out.print(" 1.상품 등록 |  2.상품 목록 | 3.종료\n 메뉴를 선택하세요: ");
            int menu = scanner.nextInt();
            scanner.nextLine();

            if(menu == 1) {
                if (productCounts == maxProduct) {
                    System.out.println("상품을  더이상 등록하실수 없습니다.");
                    continue; //아래 코드는 다 무시하고 while 문으로 다시돌아감
                }
                System.out.print("상품 이름을 입력해주세요: ");
                productNames[productCounts] =scanner.nextLine();
               
                System.out.print("상품 가격을 입력하세요: ");
                productPrices[productCounts]=scanner.nextInt();

                productCounts++;
            }else if (menu == 2) {
                if (productCounts == 0) {
                    System.out.println("등록된 상품이 없습니다.");
                    continue;
                }
                for (int i = 0; i < productCounts; i++) {
                    System.out.println(productNames[i]+ ":" + productPrices[i]+"원");
                }
            }else if (menu ==3){
                System.out.println("프로그램을 종료합니다.");
                break;
            }else {
                System.out.println("잘못된 메뉴를 선택하셨습니다.");
            }


        }
        }
       
    }
