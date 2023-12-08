package loop.ex;

public class ex4 {
    public static void main(String[] args) {
        /*문제: 누적 합 계산
            반복문을 사용하여 1부터 `max`까지의 합을 계산하고 출력하는 프로그램을 작성해 보세요
             이때, sum이라는 변수를 사용하여 누적 합을 표현하고 i라는 변수를 사용하여 카운트
            (1부터 max까지 증가하는 변수)를 수행해야 합니다. while문, for문 2가지 버전의 정답을 만들어야 합니다
        */
        int max = 2;
        int i = 1;
        int sum = 0;

        while (i <= max) {
            sum += i; //초반 1,
            i++; //i=2가되고 sum-1 , i=3 sum =3
        }
        System.out.println(sum);

        //for 문
        int max1=2;
        int sum1=0;
        for(int count=1;count<=max1; count++){
            sum =+i;
        }
        System.out.println(sum);

    }
}
