package scanner.ex;

public class ChangeVarEx {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int temp;

        //시작: 코드를 작성하세요
        temp = a; //10 -> temp변수에 a값이 저장되고
        a = b; //a=10상태에서  b 값이 들어가면서 a=20이들어감.
        b = temp;
        //종료: 코드를 작성하세요
    }
}
