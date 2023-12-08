package loop.ex;

public class ex07 {
    public static void main(String[] args) {
        //문제: 피라미드 출력 int rows를 선언해라.이 수만큼 다음과 같은 피라미드를 출력하면 됩니다..
        int row = 5;

        for(int i=1; i<=row; i++){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
