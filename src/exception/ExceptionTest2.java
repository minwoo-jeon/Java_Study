package exception;

public class ExceptionTest2 {
    public static void main(String[] args) {
        //예외가 발생한 코드
        System.out.println(1);
        System.out.println(2);
        try{
            System.out.println(3);
            System.out.println(0/0); //예외발생  -->캐치블럭으로 감. 예외가 발생한 이후에 예외는 수행이 안됨 2번수행안됨
            System.out.println(4);  //실행안됨
        }catch (ArithmeticException ae){
            if(ae instanceof ArithmeticException)
            System.out.println("true");//try -- catch문 벗어남 4번 실행
            System.out.println("ArithmeticException");
        } //try_ catch의 긑
        System.out.println(6);
    }// main
}
