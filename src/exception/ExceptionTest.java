package exception;

public class ExceptionTest {
    public static void main(String[] args) {
        //예외가 발생하지 않은 코드
        System.out.println(1);
        try{
            System.out.println(2);
            System.out.println(3);
        }catch (Exception e){
            System.out.println(4);
        }
        System.out.println(5);
    }
}
