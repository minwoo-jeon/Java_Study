package exception;

public class ExceptionTest4 {
    public static void main(String[] args) {
        //예외가 발생한 코드
        System.out.println(1);
        System.out.println(2);
        try{
            System.out.println(3);
            System.out.println(0/0); //예외발생  -->캐치블럭으로 감. 예외가 발생한 이후에 예외는 수행이 안됨 2번수행안됨
            System.out.println(4);  //실행안됨
        }catch (ArithmeticException ae){
            ae.printStackTrace();
            System.out.println("에외 메세지:" + ae.getMessage());

        }
        System.out.println(6);
    }// main
}
