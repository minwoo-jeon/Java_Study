package exception;

public class ExceptionTest5 {
    public static void main(String[] args) {
        try {
            Exception e = new Exception("고의로 예외발생");
            throw e;  //예외를 발생시킴
            // thorw new Excepiton("고의로 발생시켯음")  -- 위에 두 줄을 한줄로 줄여 쓸수도있음
        } catch (Exception e){
            System.out.println("에러 메시지:" + e.getMessage());
            e.printStackTrace();
        }
        System.out.println("프로그램이 정상 종료 됩니다.");
    }
}
