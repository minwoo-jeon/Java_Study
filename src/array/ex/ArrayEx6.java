package array.ex;

import java.util.Scanner;

public class ArrayEx6 {
    public static void main(String[] args) {

        /*문제 - 가장 작은 수, 큰 수 찾기
        사용자로부터 n개의 정수를 입력받아 배열에 저장한 후, 배열 내에서 가장 작은 수와 가장 큰 수를 찾아 출력하는 프로
        그램을 작성하자. 실행 결과 예시를 참고하자.*/

        Scanner scanner = new Scanner(System.in);
        System.out.println("입력받을 숫자의 개수를 입력하세요:");
        int count = scanner.nextInt();
        int [] numbers = new int[count];
        int minNumber ,maxNumber;

        System.out.println(count+"개의 정수를 입력하세요");
        for (int i = 0; i < count; i++) {
            numbers[i] = scanner.nextInt();
        }
        minNumber = maxNumber= numbers[0];
        for (int i = 1; i < count; i++) {
            if (numbers[i] < minNumber) {
                minNumber = numbers[i];
            }
            if (numbers[i] > maxNumber) {
                maxNumber = numbers[i];
            }
        }
    }
}
