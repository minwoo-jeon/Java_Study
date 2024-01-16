package exception;

public class ExceptionTest1 {
    public static void main(String[] args) {
        //예외가 발생한 코드
        System.out.println(1);
        try{
            System.out.println(0/0); //예외발생  -->캐치블럭으로 감. 예외가 발생한 이후에 예외는 수행이 안됨 2번수행안됨
            System.out.println(2);  //실행안됨
        }catch (ArithmeticException ae){
            System.out.println(3);  //try -- catch문 벗어남 4번 실행
        } //try_ catch의 긑
        System.out.println(4);
    }// main
}
