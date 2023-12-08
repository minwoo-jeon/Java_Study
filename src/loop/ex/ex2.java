package loop.ex;

public class ex2 {
    public static void main(String[] args) {
        /*반복문을 사용하여 처음 10개의 짝수를 출력하는 프로그램을 작성해 보세요. 이때, `num`이라는 변수를 사용하여 수를
            표현해야 합니다.while문, for문 2가지 버전의 정답을 만들어야 합니다.*/

    //while 문
    int i = 1;
    int num =2;

    while(i <10){
        num +=2;
        System.out.println(num);
        i++;
    }

        System.out.println("----------");
    //for 문
        int num1 = 2;
        for(int count = 1; count<=10; count++) {
            System.out.println(num1);
            num1 += 2;

        }

    }
}