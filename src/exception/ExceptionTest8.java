  package exception;

  public class ExceptionTest8 {
      public static void main(String[] args) {
            int num = 100;
            int result = 0;

          for (int i = 0; i < 10; i++) {
              try {
                  result = num/(int)(Math.random() *10);
              }catch (ArithmeticException e){
                  System.out.println(0);
              }
              System.out.println(result);
          }
      }
  }