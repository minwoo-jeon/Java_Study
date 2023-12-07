package loop.ex;

public class ex06 {
    public static void main(String[] args) {
        //for 문을 사용한 구구단 출력하기

        for(int i = 1; i <=9; i++){
            System.out.println(i);
            for(int j= 1; j <=9; j++){
                System.out.println(i+"*"+j +"=" + i*j);
            }
        }
    }
}
